package test;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;

public class ComplexTest {

    @Test
    public void testMinus() throws Exception {
        Complex a = new Complex(10, 10);
        Complex b = new Complex(7, 5);
        a.minus(b);
        Assert.assertEquals("Real part:", 3.0, a.getRe(), 0.0);
        Assert.assertEquals("Imaginary part:", 5.0, a.getIm(), 0.0);
    }

    @Test
    public void testConjugate() throws Exception {
        Complex a = new Complex(10, 10);
        Assert.assertEquals("Conjugated number real part:", 10.0, a.getRe(), 0.0);
        Assert.assertEquals("Conjugated number imaginary part:", 10.0, a.getIm(), 0.0);
    }
}