import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import demo.parallel.Complex;


public class ComplexTest {

    private final static double DOUBLE_DELTA = 1E-10;

    @Before
    public void setUp() {
    }

    @After
    public void destroy() {
    }

    @Test
    public void testRe() {
        Complex a = new Complex(1, 0);
        Complex b = new Complex(0,0);
        Complex c = new Complex(-1, 0);

        Assert.assertEquals(1.0, a.Re(), DOUBLE_DELTA);
        Assert.assertEquals(0.0, b.Re(), DOUBLE_DELTA);
        Assert.assertEquals(-1.0, c.Re(), DOUBLE_DELTA);
    }

    @Test
    public void testIm() {
        Complex a = new Complex(0, 1);
        Complex b = new Complex(0,0);
        Complex c = new Complex(0, -1);

        Assert.assertEquals(1.0, a.Im(), DOUBLE_DELTA);
        Assert.assertEquals(0.0, b.Im(), DOUBLE_DELTA);
        Assert.assertEquals(-1.0, c.Im(), DOUBLE_DELTA);
    }

    @Test
    public void testArg() {
        Complex a = new Complex(0, 0);
        Complex b = new Complex(1, 0);
        Complex c = new Complex(0, 1);
        Complex d = new Complex(-1, 0);
        Complex e = new Complex(0, -1);
        Complex f = new Complex(2, 2);
        Complex g = new Complex(2, 3.46410161513);
        Complex h = new Complex(4, 2.30940107675);

        Assert.assertEquals(Double.NaN, a.Arg(), DOUBLE_DELTA);
        Assert.assertEquals(0, b.Arg(), DOUBLE_DELTA);
        Assert.assertEquals(Math.PI / 2, c.Arg(), DOUBLE_DELTA);
        Assert.assertEquals(Math.PI, d.Arg(), DOUBLE_DELTA);
        Assert.assertEquals(-Math.PI / 2, e.Arg(), DOUBLE_DELTA);
        Assert.assertEquals(Math.PI / 4, f.Arg(), DOUBLE_DELTA);
        Assert.assertEquals(Math.PI / 3, g.Arg(), DOUBLE_DELTA);
        Assert.assertEquals(Math.PI / 6, h.Arg(), DOUBLE_DELTA);
    }

    @Test
    public void testEqual() {
        Complex a = new Complex(4, 3);
        Complex b = new Complex(0, 0);
        Complex c = new Complex(4, 3);

        Assert.assertTrue(a.equal(c));
        Assert.assertFalse(a.equal(b));
    }

    @Test
    public void testIsNaN() {
        Complex a = new Complex(Double.NaN, Double.NaN);

        Assert.assertTrue(a.isNaN());
    }

    @Test
    public void testConjugate() {
        Complex a = new Complex(4, 3);
        Complex b = new Complex(4, -3);

        a = a.conjugate();

        Assert.assertTrue(a.equal(b));
    }

    @Test
    public void testMinus() {
        Complex a = new Complex(4, 8);
        Complex b = new Complex(-2, 1);
        Complex subtrahend = new Complex(3, 8);

        a.minus(subtrahend);
        b.minus(subtrahend);

        Assert.assertTrue("", a.equal(new Complex(1, 0)));
        Assert.assertTrue("", b.equal(new Complex(-5, -7)));
    }

    @Test
    public void testDivide() {
        Complex a = new Complex(10, 4);
        Complex b = new Complex(2, 4);
        Complex c = new Complex(0, 0);
        Complex d = new Complex(-14, -8);

        a.divide(b);
        d.divide(b);
        b.divide(c);

        Assert.assertTrue(d.equal(new Complex(-3, 2)));
        Assert.assertTrue(a.equal(new Complex(1.8, -1.6)));
        Assert.assertTrue(b.isNaN());
    }
}
