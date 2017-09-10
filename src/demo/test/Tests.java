package demo.test;

import demo.parallel.Complex;
import org.junit.*;

import static org.junit.Assert.assertTrue;

public class Tests {
    private Complex a;
    private Complex b;
    private Complex c;
    private Complex r;

    @Before
    public void init () {
        a = new Complex(-2,1);
        b = new Complex(1,-1);
        r = new Complex(-1.5, -0.5);
        c = new Complex(0,0);
    }

    @After
    public void del () {
        a = null;
        b = null;
        c = null;
        r = null;
    }

    @Test
    public void divRe() {
        assertTrue(a.div(b).getRe() == r.getRe());
    }

    @Test
    public void divIm() {
        assertTrue(a.div(b).getIm() == r.getIm());
    }

    /*@Test(expected = ArithmeticException.class)
    public void divNegative() {
        a.div(new Complex(0, 0));
    }*/
}
