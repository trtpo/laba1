package demo.parallel.test;

import demo.parallel.Complex;
import org.junit.Assert;

public class ComplexTest {

    @org.junit.Test
    public void substractTest() throws Exception {
        Assert.assertEquals(new Complex(1,2),new Complex(2,3).substract(new Complex(1,1)));
    }

    @org.junit.Test
    public void sinTest() throws Exception {

        double real = Math.sin(5) * Math.cosh(2);
        double imaginary = Math.cos(5) * Math.sinh(2);
        Complex expected = new Complex(real, imaginary);
        Assert.assertEquals(expected,new Complex(5,2).sin());
    }

    @org.junit.Test
    public void cosTest() throws Exception {

        double real = Math.cos(5) * Math.cosh(2);
        double imaginary = -Math.sin(5) * Math.sinh(2);
        Complex expected = new Complex(real, imaginary);
        Assert.assertEquals(expected,new Complex(5,2).cos());
    }

}
