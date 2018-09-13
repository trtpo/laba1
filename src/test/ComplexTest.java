package test;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void subtraction() {
        Complex a = new Complex(0,0);
        Complex b = new Complex(-3,2);
        Complex result = a.subtraction(b);
        Assert.assertEquals("successful subtraction", result, new Complex(3,-2));
    }

    @Test
    public void division() {
        Complex a = new Complex(13, 5);
        Complex b = new Complex(-3, 1);
        Complex result = a.division(b);
        Assert.assertEquals("division failed", result, new Complex(-3.4,-2.8));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionOnZero() {
        Complex a = new Complex(13, 5);
        Complex b = new Complex(0, 0);
        a.division(b);
    }
}
