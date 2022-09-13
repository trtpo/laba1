package test;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class test {
    @Test
    public void testMinus() throws Exception{
        Complex a = new Complex(1178, 28);
        Complex b = new Complex(100,-10);
        a.minus(b);
        Assert.assertTrue(a.getRe() == 1078);
        Assert.assertTrue(a.getIm() == 38 );
    }

    @Test
    public void testPlus() throws Exception{
        Complex a = new Complex(0, -197);
        Complex b = new Complex(150,100);
        a.plus(b);
        Assert.assertTrue( a.getRe() == 150);
        Assert.assertTrue( a.getIm() == -97);
    }
}