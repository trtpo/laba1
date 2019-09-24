package demo.parallel;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ComplexTest {
    @Test
    public void minus() {
        Complex a = new Complex(13, -10);
        Complex b = new Complex(5, 12);

        Complex result = a.minus(b);
        Complex expected = new Complex(8, -22);

        assertEquals(expected, result);
    }

    @Test
    public void divide() {
        Complex a = new Complex(20, 10);
        Complex b = new Complex(10, 5);

        Complex result = a.divide(b);
        Complex expected = new Complex(2, 0);

        assertEquals(expected, result);
    }

    @Test
    public void sin() {
        double re = 1;
        double im = 1;

        Complex a = new Complex(re, im);
        Complex result = a.sin();

        double sinRe = Math.sin(re) * Math.cosh(im);
        double sinIm = Math.cos(re) * Math.sinh(im);
        Complex expected = new Complex(sinRe, sinIm);

        assertEquals(expected, result);
    }

    @Test
    public void cos() {
        double re = 1;
        double im = 1;

        Complex a = new Complex(re, im);
        Complex result = a.cos();

        double cosRe = Math.cos(re) * Math.cosh(im);
        double cosIm = -Math.sin(re) * Math.sinh(im);
        Complex expected = new Complex(cosRe, cosIm);

        assertEquals(expected, result);
    }
}