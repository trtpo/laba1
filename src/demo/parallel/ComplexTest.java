package demo.parallel;

import org.junit.Assert;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void minus() {
        Complex expected, real;
        expected=new Complex(-3, 5);
        real=new Complex(2, 4).minus(new Complex(5, -1));
        Assert.assertEquals(expected.getRe(), real.getRe(), 0);
        Assert.assertEquals(expected.getIm(), real.getIm(), 0);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        double a, b, c;
        a=Math.random();
        b=Math.random();
        c=Math.random();
        Complex expected=new Complex(a, b).multiply(c);
        a*=c;
        b*=c;
        Assert.assertEquals(expected.getRe(), a, 0);
        Assert.assertEquals(expected.getIm(), b, 0);
    }

    @org.junit.jupiter.api.Test
    void power() {
        Complex expected, real;

        expected=new Complex(-29113, -17684);
        real=new Complex(7, -4).power(5);

        Assert.assertEquals(expected.getRe(), real.getRe(), 0.00001);
        Assert.assertEquals(expected.getIm(), real.getIm(), 0.00001);
    }

    @org.junit.jupiter.api.Test
    void division() {
        Complex expected, real;

        expected=new Complex(0.31034, -1.27586);
        real=new Complex(1, 7).division(new Complex(-5, 2));

        Assert.assertEquals(expected.getRe(), real.getRe(), 0.00001);
        Assert.assertEquals(expected.getIm(), real.getIm(), 0.00001);
    }
}
