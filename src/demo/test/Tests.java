package demo.test;

import demo.parallel.Complex;
import org.junit.*;

import static org.junit.Assert.assertTrue;

public class Tests {
    private Complex a;
    private Complex b;
    private Complex c;
    private Complex res1;
    private Complex res2;

    @Before
    public void init() {
        a = new Complex(-2, 1);
        b = new Complex(1, -1);
        res1 = new Complex(-1.5, -0.5);
        res2 = new Complex(-0.6000000000000001, 0.2);
        c = new Complex(0, 0);
    }

    @After
    public void del() {
        a = null;
        b = null;
        c = null;
        res1 = null;
        res2 = null;
    }

    @Test
    public void divRe1() {
        assertTrue("Test divRe1 failed in method div of class demo.parallel.Complex", a.div(b).getRe() == res1.getRe());
    }

    @Test
    public void divIm1() {
        assertTrue("Test divIm1 failed in method div of class demo.parallel.Complex",a.div(b).getIm() == res1.getIm());
    }

    @Test
    public void divRe2() {
        assertTrue("Test divRe2 failed in method div of class demo.parallel.Complex",b.div(a).getRe() == res2.getRe());
    }

    @Test
    public void divIm2() {
        assertTrue("Test divIm2 failed in method div of class demo.parallel.Complex",b.div(a).getIm() == res2.getIm());
    }

    @Test(expected = ArithmeticException.class)
    public void divNegative() {
        a.div(c);
    }
}
