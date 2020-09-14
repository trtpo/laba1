package demo.parallel;

import org.junit.Assert;

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
    void div() {
        Complex a = new Complex(3,4);
        Complex b = new Complex(6,8);
        Complex div = new Complex(2,0);
        a=a.div(b);
        Assert.assertEquals(a.getRe(),div.getRe(),0);
        Assert.assertEquals(a.getIm(),div.getIm(),0);
    }
}