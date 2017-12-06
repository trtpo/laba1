package demo.parallel;

import junit.framework.TestCase;

public class Test extends TestCase {

    public void testPlus()
    {
        Complex a = new Complex(1,2);
        Complex b = new Complex(2,2);
        a.plus(b);

        assertEquals((double)3, a.getRe());
        assertEquals((double)4, a.getIm());
    }

    public void testTimes()
    {
        Complex a = new Complex(1,2);
        Complex b = new Complex(2,2);
        a.times(b);

        assertEquals((double)-2, a.getRe());
        assertEquals((double)6, a.getIm());
    }

    public void testMinus()
    {
        Complex a = new Complex(3,4);
        Complex b = new Complex(2,2);
        a.minus(b);

        assertEquals((double)1, a.getRe());
        assertEquals((double)2, a.getIm());
    }

    public void testdivision()
    {
        Complex a = new Complex(7,-4);
        Complex b = new Complex(3,2);
        a.division(b);

        assertEquals((double)1, a.getRe());
        assertEquals((double)-2, a.getIm());
    }
}


