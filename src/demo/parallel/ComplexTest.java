package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void testDivide() throws Exception {
        Complex a = new Complex (7,7);
        a.divide(new Complex(4,3));
        assertEquals(a.getRe(), 1.96, Double.MIN_VALUE);
        assertEquals(a.getIm(), 0.28, Double.MIN_VALUE);

        Complex c = new Complex(Double.MAX_VALUE, Double.MAX_VALUE);
        c.divide(new Complex(0,0));
        assertEquals(c.getRe(), Double.NaN, Double.MIN_VALUE);
        assertEquals(c.getIm(), Double.NaN, Double.MIN_VALUE);
    }

    @Test
    public void testSubtraction() throws Exception {
        Complex a;
        Complex b;
        Complex res;
        double re, re2, im, im2;

        for (int i = 0; i < 10; i++){
            re = Math.random();
            im = Math.random();

            re2 = Math.random();
            im2 = Math.random();

            a = new Complex(re, im);
            b = new Complex(re2, im2);

            a.subtraction(b);
            assertEquals(a.getRe(), re - re2, Double.MIN_VALUE);
            assertEquals(a.getIm(), im-im2, Double.MIN_VALUE);
        }
    }
}