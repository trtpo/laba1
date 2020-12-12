package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void plus() {
        Complex a = new Complex(2.0,2.0);
        Complex b = new Complex(3.0,3.0);
        Complex sum = new Complex(5.0,5.0);
        a=a.plus(b);
        Assert.assertEquals(a.getRe(),sum.getRe(), 0);
        Assert.assertEquals(a.getIm(),sum.getIm(), 0);
    }

    @Test
    public void times() {
        Complex a = new Complex(2,2);
        Complex b = new Complex(3,3);
        Complex mul = new Complex(0,12);
        a = a.times(b);
        Assert.assertEquals(a.getRe(),mul.getRe(), 0);
        Assert.assertEquals(a.getIm(),mul.getIm(), 0);
    }

    @Test
    public void lengthSQ() {
        Complex a = new Complex(2,5);
        double length = 29;
        Assert.assertEquals(a.lengthSQ(),length,0);
    }
}