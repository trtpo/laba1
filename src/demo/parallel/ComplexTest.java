package demo.parallel;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void plus() {
       Complex a = new Complex(12.0,12.0);
    Complex b = new Complex(3.0,3.0);
    Complex sum = new Complex(15.0,15.0);
    a=a.plus(b);
        Assert.assertEquals(a.getRe(),sum.getRe(), 0);
        Assert.assertEquals(a.getIm(),sum.getIm(), 0);
}

    @Test
    void min() {
        Complex a = new Complex(12.0,12.0);
        Complex b = new Complex(3.0,3.0);
        Complex raznost = new Complex(9.0,9.0);
        a=a.min(b);
        Assert.assertEquals(a.getRe(),raznost.getRe(), 0);
        Assert.assertEquals(a.getIm(),raznost.getIm(), 0);
    }

    @Test
    void times() {
        Complex a = new Complex(12.0,12.0);
        Complex b = new Complex(3.0,3.0);
        Complex composition = new Complex(0.0,72.0);
        a=a.times(b);
        Assert.assertEquals(a.getRe(),composition.getRe(), 0);
        Assert.assertEquals(a.getIm(),composition.getIm(), 0);
    }
}