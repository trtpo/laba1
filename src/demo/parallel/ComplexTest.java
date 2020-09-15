/*package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    @Test
    public void plus() {
        Complex a = new Complex(9, 3);
        Complex b = new Complex(2, 2);
        Complex sum = new Complex(11, 5);
        a = a.plus(b);
        Assert.assertEquals(a.getIm(), sum.getIm(), 0);
        Assert.assertEquals(a.getRe(), sum.getRe(), 0);

    }

    @Test
    public void Testcos() {
        Complex a = new Complex(2.7, 6);
        Complex b = a.cos();
        assertTrue(b.isEqual(new Complex(Math.cos(a.getRe()) * Math.cosh(a.getIm()), -Math.sin(a.getRe()) * Math.sinh(a.getIm()))));


    }

    @Test
    public void IsEqual() {
        Complex a = new Complex(2.7, 6);
        Complex b = new Complex(2.7, 6);
        assertTrue(a.isEqual(b));
    }

}*/