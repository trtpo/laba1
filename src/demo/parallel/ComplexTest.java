package demo.parallel;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void plus() {
        Complex a = new Complex(1.0,1.0);
        Complex b = new Complex(2.0,2.0);
        Complex sum = new Complex(3.0,3.0);
        a=a.plus(b);
        Assert.assertEquals(a.getRe(),sum.getRe(), 0);
        Assert.assertEquals(a.getIm(),sum.getIm(), 0);
    }

    @org.junit.jupiter.api.Test
    void times() {
        Complex a = new Complex(1.0,1.0);
        Complex b = new Complex(2.0,2.0);
        Complex mul = new Complex(0.0,4.0);
        a=a.times(b);
        Assert.assertEquals(a.getRe(),mul.getRe(), 0);
        Assert.assertEquals(a.getIm(),mul.getIm(), 0);
    }

    @org.junit.jupiter.api.Test
    void minus() {
        Complex a = new Complex(2.0,2.0);
        Complex b = new Complex(1.0,1.0);
        Complex diff = new Complex(1.0,1.0);
        a=a.minus(b);
        Assert.assertEquals(a.getRe(),diff.getRe(), 0);
        Assert.assertEquals(a.getIm(),diff.getIm(), 0);
    }
}