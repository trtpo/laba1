package tests;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;


public class ComplexNumbersTest {
    @Test()
    public void divOnOne() {
        Complex a = new Complex(88, 89);
        Assert.assertEquals("method div() work bad with real 1", a.div(new Complex(1, 0)), new Complex(88, 89));
        Assert.assertEquals("method div() work bad with real -1", a.div(new Complex(-1, 0)), new Complex(-88, -89));
    }


    @Test()
    public void divOnOneComplex() {
        Complex a = new Complex(88, -2);
        Assert.assertEquals("method div() work bad with 1+1i", a.div(new Complex(1, 1)), new Complex(43, -45));
    }

    @Test(expected = ArithmeticException.class)
    public void divOnZero() {
        Complex a = new Complex(88, -2);
        Complex b = new Complex(0, 0);
        Assert.assertEquals("method div(): division by zero work incorrectly", a.div(b), new Complex(43, -45));
    }


    @Test()
    public void divOnAnyComplex() {
        Assert.assertEquals("method div() work bad with some complex number", new Complex(4, 40).div(new Complex(2, 0)), new Complex(2, 20));
        Assert.assertEquals("method div() work bad with some complex number", new Complex(4, 40).div(new Complex(0, -2)), new Complex(-20, 2));
    }
}

