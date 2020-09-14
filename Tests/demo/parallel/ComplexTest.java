package demo.parallel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class ComplexTest{

    private Complex a;
    private Complex b;

    @Before
    public void beforeEachTestMethod() throws Exception{
        a = new Complex(2.0, 2.0);
        b = new Complex(1.0, 1.0);
    }

    @org.junit.Test
    public void plus() {
        Complex sum = new Complex(3.0, 3.0);
        a = a.plus(b);
        Assert.assertEquals(a.getRe(), sum.getRe(), 0);
        Assert.assertEquals(a.getIm(), sum.getIm(), 0);
    }

    @org.junit.Test
    public void minus() {
        Complex diff = new Complex(1.0, 1.0);
        a = a.minus(b);
        Assert.assertEquals(a.getRe(), diff.getRe(), 0);
        Assert.assertEquals(a.getIm(), diff.getIm(), 0);
    }

    @org.junit.Test
    public void times() {
        Complex mull = new Complex(0.0, 4.0);
        a = a.times(b);
        Assert.assertEquals(a.getRe(), mull.getRe(), 0);
        Assert.assertEquals(a.getRe(), mull.getRe(), 0);
     }

    @org.junit.Test
    public void div() {
        Complex diff = new Complex(2.0, 0.0);
        a = a.div(b);
        Assert.assertEquals(a.getRe(), diff.getRe(), 0);
        Assert.assertEquals(a.getIm(), diff.getIm(), 0);
    }

    @org.junit.Test
    public void cos() {
        Complex a = new Complex(0.0, 0.0);
        Complex cs = new Complex(1.0, 0.0);
        a = a.cos(a);
        Assert.assertEquals(a.getRe(), cs.getRe(), 0);
        Assert.assertEquals(a.getIm(), cs.getIm(), 0);
    }

    @Test
    public void sin() {
        Complex a = new Complex(3.0, 2.0);
        Complex cs = new Complex(0.5, -3.6);
        a = a.sin(a);
        Assert.assertEquals(a.getRe(), cs.getRe(), 0.3);
        Assert.assertEquals(a.getIm(), cs.getIm(), 0.3);
    }
}