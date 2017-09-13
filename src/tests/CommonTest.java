package tests;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;

public class CommonTest extends Assert{
    @Test(expected = ArithmeticException.class)
    public void testDivisionByNull() {
        Complex a = new Complex(10, 5);
        Complex b = new Complex(0, 0);
        a.divide(b);
        System.out.println("No ArithmeticException!");
    }

    @Test()
    public void testNulltoDivision() {
        Complex a = new Complex(0, 0);
        Complex b = new Complex(10, 20);
        assertEquals("error in method divide()", a.divide(b), new Complex(0, 0));
    }

    @Test()
    public void testRegularDivision() {
        Complex a = new Complex(149, -35);
        Complex b = new Complex(10, 11);
        assertEquals("error in method divide()", a.divide(b), new Complex(5, -9));
    }

    @Test()
    public void testDivisionByOne() {
        Complex a = new Complex(149, -35);
        Complex b = new Complex(1, 0);
        assertEquals("error in method divide()", a.divide(b), new Complex(149, -35));
    }

    @Test()
    public void testNegativeMinus() {
        Complex a = new Complex(0, 0);
        Complex b = new Complex(10, 20);
        assertEquals("error in method minus()", a.minus(b), new Complex(-10, -20));
    }

    @Test()
    public void testMinusWithNull() {
        Complex a = new Complex(10, 20);
        Complex b = new Complex(10, 20);
        assertEquals("error in method minus()", a.minus(b), new Complex(0, 0));
    }

    @Test()
    public void testRegularMinus() {
        Complex a = new Complex(146, 47);
        Complex b = new Complex(1, 52);
        assertEquals("error in method minus()", a.minus(b), new Complex(145, -5));
    }
}
