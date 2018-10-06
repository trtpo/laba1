package demo.parallel;

import demo.parallel.Complex;
import junit.framework.TestCase;
import org.junit.Test;

public class Tester extends TestCase {

    @Test
    public void testPlus() {
        Complex a = new Complex(1,2);
        Complex b = new Complex(3,4);
        a.plus(b);
        assertEquals((double)4, a.GetRe());
        assertEquals((double)6, a.GetIm());
    }

    @Test
    public void testMinus() {
        Complex a = new Complex(1,2);
        Complex b = new Complex(3,4);
        a.minus(b);
        assertEquals((double)-2, a.GetRe());
        assertEquals((double)-2, a.GetIm());
    }

    @Test
    public void testTimes() {
        Complex a = new Complex(1,2);
        Complex b = new Complex(3,4);
        a.times(b);
        assertEquals((double)-5, a.GetRe());
        assertEquals((double)10, a.GetIm());
    }

    @Test
    public void testDivide() {
        Complex a = new Complex(1,2);
        Complex b = new Complex(3,4);
        a.divide(b);
        assertEquals(0.44, a.GetRe());  // 11/25
        assertEquals(0.08, a.GetIm());  // 2/25
    }
}