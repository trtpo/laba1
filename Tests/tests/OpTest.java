package tests;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OpTest {
    private Complex a;
    private Complex b;
    @Before
    public void setup() throws Exception{
        a = new Complex(2, 5);
        b = new Complex(3, -2);
    }
    @Test
    public void testDivide() throws Exception{
        a.divide(b);
        Assert.assertEquals("Mistake in divide operation (real part)", -0.3,
                a.getRe(),0.01);
        Assert.assertEquals("Mistake in divide operation (img part)", 1.46,
                a.getIm(), 0.01);
    }
    @Test
    public void testArg() throws Exception{
        Assert.assertEquals("Mistake in argument", 1.1902,
                a.arg(), 0.01 );

    }
    @Test
    public void testСonjugate() throws Exception{
        a.сomplexСonjugate();
        Assert.assertEquals("Mistake in сomplex conjugate(real)", 2,
                a.getRe(), 0.01 );
        Assert.assertEquals("Mistake in сomplex conjugate(im)", -5,
                a.getIm(), 0.01);
    }
}