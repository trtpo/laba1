package tests;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;


public class ComplexNumbersTest {


    @Test()
    public void divisionByOneComplex() {
        Complex a = new Complex(88, -2);
        Assert.assertEquals("method div() does not work correctly with 1+0i", a.div(new Complex(1, 0)), new Complex(88, -2));
        Assert.assertEquals("method div() does not work correctly with -1+0i", a.div(new Complex(-1, 0)), new Complex(-88, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionByZero() {
        Complex a = new Complex(88, -2);
        Complex b = new Complex(0, 0);
        Assert.assertEquals("method div() does not work correctly with division by zero", a.div(b), new Complex(43, -45));
    }


    @Test()
    public void divisionByAnyComplex() {
        Assert.assertEquals("method div() does not work correctly with some complex number", new Complex(4, 40).div(new Complex(2, 0)), new Complex(2, 20));
        Assert.assertEquals("method div() does not work correctly with some complex number", new Complex(4, 40).div(new Complex(0, -2)), new Complex(-20, 2));
    }
}

