package sample;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void minus() {
        double a, b, c, d;
        Complex expected, real;
        a=Math.random();
        b=Math.random();
        c=Math.random();
        d=Math.random();
        expected=new Complex(a, b).plus(new Complex(-1*c, -1*d));
        real=new Complex(a, b).minus(new Complex(c, d));
        Assert.assertEquals(expected.getRe(), real.getRe(), 0);
        Assert.assertEquals(expected.getIm(), real.getIm(), 0);
    }

    @org.junit.jupiter.api.Test
    void power() {
        double a, b, moduleReal, phaseReal, moduleExpected, phaseExpected;;
        int c;
        Complex real;
        a=Math.random();
        b=Math.random();
        c=(int)Math.random();

        real=new Complex(a, b).power(c);
        moduleReal=Math.sqrt(real.getRe()*real.getRe()+real.getIm()*real.getIm());
        phaseReal=Math.atan(real.getIm()/real.getRe());

        moduleExpected=Math.pow(Math.sqrt(a*a+b*b), c);
        phaseExpected=Math.atan(b/a)*c;

        Assert.assertEquals(moduleExpected, moduleReal, 0);
        Assert.assertEquals(phaseExpected, phaseReal, 0);
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
    void division() {
        Complex real;
        double a, b, c, d, moduleReal, phaseReal, moduleExpected, phaseExpected;
        a=Math.random();
        b=Math.random();
        c=Math.random();
        d=Math.random();

        real=new Complex(a, b).division(new Complex(c, d));
        moduleReal=Math.sqrt(real.getRe()*real.getRe()+real.getIm()*real.getIm());
        phaseReal=Math.atan(real.getIm()/real.getRe());

        moduleExpected=Math.sqrt(a*a+b*b)/Math.sqrt(c*c+d*d);
        phaseExpected=Math.atan(b/a)-Math.atan(d/c);
        Assert.assertEquals(moduleExpected, moduleReal, 0.0000001);
        Assert.assertEquals(phaseExpected, phaseReal, 0.0000001);
    }
}
