package demo.parallel.unitTest;

import demo.parallel.Complex;
import static org.junit.Assert.*;
import org.junit.Test;

public class ComplexTest {

    @Test
    public void testMinus() throws Exception {
        String errorMessage = "Error in subtract operation";
        Complex a = new Complex(23,12);
        Complex b = new Complex(12,23);
        assertTrue(errorMessage, (a.minus(b)).equals(new Complex(11, -11)));
    }

    @Test
    public void testDivideOn() {
        String errorMessage = "Error in division";

        Complex a = new Complex(-1, 3);
        Complex b = new Complex(1, 2);

        assertTrue(errorMessage, (a.divideOn(b).equals(new Complex(1, 1))));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionOnZero() {
        new Complex(6, 1).divideOn(new Complex(0, 0));
    }

    @Test
    public void testEquals() {
        String errorMessage = "testEquals error";
        Complex a = new Complex(6.1,5.1);
        Complex b = new Complex(6.1,5.1);
        assertTrue(errorMessage, a.equals(b));
    }
}