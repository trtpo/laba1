package demo.parallel;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ComplexTest {
    @Test
    public void minusPositiveRePositiveIm() {
        Complex a = new Complex(13, -10);
        Complex b = new Complex(5, 12);

        Complex result = a.minus(b);
        Complex expected = new Complex(8, -22);

        assertEquals(expected, result);
    }

    @Test
    public void minusPositiveReNegativeIm() {
        Complex a = new Complex(13, -10);
        Complex b = new Complex(5, -12);

        Complex result = a.minus(b);
        Complex expected = new Complex(8, 2);

        assertEquals(expected, result);
    }

    @Test
    public void minusNegativeRePositiveIm() {
        Complex a = new Complex(13, -10);
        Complex b = new Complex(-5, 12);

        Complex result = a.minus(b);
        Complex expected = new Complex(18, -22);

        assertEquals(expected, result);
    }

    @Test
    public void minusNegativeReNegativeIm() {
        Complex a = new Complex(13, -10);
        Complex b = new Complex(-100, -100);

        Complex result = a.minus(b);
        Complex expected = new Complex(113, 90);

        assertEquals(expected, result);
    }

    @Test
    public void divideTest() {
        Complex a = new Complex(20, 10);
        Complex b = new Complex(10, 5);

        Complex result = a.divide(b);
        Complex expected = new Complex(2, 0);

        assertEquals(expected, result);
    }

    @Test
    public void divideZeroTest() {
        Complex a = new Complex(20, 10);
        Complex b = new Complex(0, 0);

        Complex result = a.divide(b);
        Complex expected = new Complex(Double.NaN, Double.NaN);

        assertEquals(expected, result);
    }

    @Test
    public void sinTest1() {
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
    public void sinTest2() {
        double re = 20;
        double im = 10;

        Complex a = new Complex(re, im);
        Complex result = a.sin();

        double sinRe = Math.sin(re) * Math.cosh(im);
        double sinIm = Math.cos(re) * Math.sinh(im);
        Complex expected = new Complex(sinRe, sinIm);

        assertEquals(expected, result);
    }

    @Test
    public void sinZeroTest() {
        double re = 0;
        double im = 0;

        Complex a = new Complex(re, im);
        Complex result = a.sin();

        double sinRe = Math.sin(re) * Math.cosh(im);
        double sinIm = Math.cos(re) * Math.sinh(im);
        Complex expected = new Complex(sinRe, sinIm);

        assertEquals(expected, result);
    }

    @Test
    public void cosTest1() {
        double re = 1;
        double im = 1;

        Complex a = new Complex(re, im);
        Complex result = a.cos();

        double cosRe = Math.cos(re) * Math.cosh(im);
        double cosIm = -Math.sin(re) * Math.sinh(im);
        Complex expected = new Complex(cosRe, cosIm);

        assertEquals(expected, result);
    }

    @Test
    public void cosTest2() {
        double re = 20;
        double im = 20;

        Complex a = new Complex(re, im);
        Complex result = a.cos();

        double cosRe = Math.cos(re) * Math.cosh(im);
        double cosIm = -Math.sin(re) * Math.sinh(im);
        Complex expected = new Complex(cosRe, cosIm);

        assertEquals(expected, result);
    }

    @Test
    public void cosZeroTest() {
        double re = 0;
        double im = 0;

        Complex a = new Complex(re, im);
        Complex result = a.sin();

        double sinRe = Math.sin(re) * Math.cosh(im);
        double sinIm = Math.cos(re) * Math.sinh(im);
        Complex expected = new Complex(sinRe, sinIm);

        assertEquals(expected, result);
    }
}