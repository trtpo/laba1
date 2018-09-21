package test;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void minus() {
        String errorInfo = "Error in subtraction of two complex numbers";
        Complex a = new Complex(5, 10);
        Complex b = new Complex(-10, 20);
        assertEquals(errorInfo, a.minus(b), new Complex(15, -10));
    }

    @Test
    public void divisionByZero() {
        Complex a = new Complex(25, -13);
        Complex b = new Complex(0, 0);
        assertEquals(a.divide(b).getRe(), Double.NaN, 0);
        assertEquals(a.divide(b).getIm(), Double.NaN, 0);
    }

    @Test
    public void division() {
        String errorInfo = "Error in division of two complex numbers";
        Complex a = new Complex(-2, 1);
        Complex b = new Complex(1, -1);
        assertEquals(errorInfo, a.divide(b), new Complex(-1.5, -0.5));
    }

    @Test
    public void exp() {
        String errorInfo = "Error in exponent of complex number";
        Complex a = new Complex(1, 0);
        assertEquals(errorInfo, a.exp(), new Complex(Math.E, 0));
    }
    @Test
    public void expOfZero() {
        String errorInfo = "Error in exponent of complex number";
        Complex a = new Complex(0, 0);
        assertEquals(errorInfo, a.exp(), new Complex(1, 0));
    }
}