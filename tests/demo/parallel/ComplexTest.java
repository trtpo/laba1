package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void testMinusBasic() throws Exception {
        String errorMessage = "Minus operation with basic numbers";
        Complex a = new Complex(7,3);
        Complex b = new Complex(4,1);
        a.minus(b);
        assertTrue(errorMessage, a.equals(new Complex(3, 2)));
    }

    @Test
    public void testMinusNegative() throws Exception {
        String errorMessage = "Minus operation with negative numbers";
        Complex a = new Complex(1000,-105);
        Complex b = new Complex(-16,2);
        a.minus(b);
        assertTrue(errorMessage, a.equals(new Complex(1016, -107)));
    }

    @Test
    public void testMinusLong() throws Exception {
        String errorMessage = "Minus operation with long numbers";
        Complex a = new Complex(32121220291156333.5,9140119945336444.9);
        Complex b = new Complex(32121220291156333.5,9140119945336444.9);
        a.minus(b);
        assertTrue(errorMessage, a.equals(new Complex(0, 0)));
    }

    @Test
    public void testDivideBasic() throws Exception {
        String errorMessage = "Division operation with basic numbers";
        Complex a = new Complex(16,20);
        Complex b = new Complex(4,5);
        a.divide(b);
        assertTrue(errorMessage, a.equals(new Complex(4,0)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideZero() {
        String errorMessage = "Division operation with zero";
        Complex a = new Complex(7,2);
        Complex b = new Complex(0,0);
        a.divide(b);
        assertTrue(errorMessage, a.equals(new Complex(0,0)));
    }

    @Test
    public void testDivideLong() throws Exception {
        String errorMessage = "Division operation with long numbers";
        Complex a = new Complex(1232174029345626842.1,135134023345126043.0);
        Complex b = new Complex(1232174029345626842.1,135134023345126043.0);
        a.divide(b);
        assertTrue(errorMessage, a.equals(new Complex(1,0)));
    }

}