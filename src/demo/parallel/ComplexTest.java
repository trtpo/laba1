package demo.parallel;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexTest {

    @Test
    void test_abs() {
        double re = 1;
        double im = 2;
        assertEquals(2.23606797749979, Math.hypot(re, im));
    }

    @Test
    void test_phase() {
        double re = 90;
        double im = 15;
        double result = Math.atan2(re, im);
        assertEquals(Math.atan2(90, 15), result);
    }

@Test
    void test_plus () {
        double re = 1;
        double im = 2;
        double re_this = 3;
        double im_this = 4;
        Complex test_item= new Complex(re + re_this,im + im_this);
        assertEquals(new Complex(4,6), test_item);
    }

    @Test
    void test_minus() {
        assertEquals(5, 5);
    }

    @Test
    void test_times() {
    double re = 1;
    double im = 2;
    double re_this = 3;
    double im_this = 4;
    double real = re * re_this - im * im_this;
    double imag = re * im_this + im * re_this;
    Complex test_item = new Complex(real,im);
    assertEquals(new Complex(-5, 2), test_item);
}
    @Test
    void test_scale() {
        double re = 1;
        double im = 2;
        double scale = re * re + im * im;
        Complex comp = new Complex(re / scale, -im / scale);
        assertEquals(new Complex(0.2, -0.4), comp);
    }

    @Test
    void test_conjugate() {
        double re = 1;
        double im = 2;
        assertEquals(new Complex(1, -2), new Complex(re, -im));
    }

    @Test
    void test_reciprocal() {
        double re = 1;
        double im = 2;
        double scale = re * re + im * im;
        Complex result = new Complex(re / scale, -im / scale);
        assertEquals(new Complex(0.2, -0.4), result);
    }
//divides
    @Test
    void test_divides() {
        double re = 1;
        double im = 2;
        double re_this = 4;
        double im_this = 4;

        double scale = re * re_this + im * im_this;
        Complex test_item_div = new Complex
                ((re * (re_this/scale)) - (im * (-im_this/scale)),(re_this * (-im/scale))
                        + (im_this * re/scale));
        assertEquals(new Complex(1.0, - 0.3333333333333333), test_item_div);
    }

    @Test
    void test_exp() {
        double re = 1;
        double im = 2;
        Complex result = new Complex(Math.exp(re) * Math.cos(im), Math.exp(re) * Math.sin(im));
        assertEquals(new Complex(Math.exp(1) * Math.cos(2), Math.exp(1) * Math.sin(2)), result);
    }

    @Test
    void test_sin() {
        double re = 1;
        double im = 2;
        Complex result = new Complex(Math.sin(re) * Math.cosh(im), Math.cos(re) * Math.sinh(im));
        assertEquals(new Complex(Math.sin(1) * Math.cosh(2), Math.cos(1) * Math.sinh(2)), result);
    }

    @Test
    void test_cos() {
        double re = 1;
        double im = 2;
        Complex result = new Complex(Math.cos(re) * Math.cosh(im), -Math.sin(re) * Math.sinh(im));
        assertEquals(new Complex(Math.cos(1) * Math.cosh(2), -Math.sin(1) * Math.sinh(2)), result);
    }

    @Test
    void test_tan() {
        double re = 1;
        double im = 2;
    }

    @org.junit.jupiter.api.Test
    void test_lengthSQ() {
        double re = 1;
        double im = 2;
        double result = re * re + im * im;
        assertEquals(5, re * re + im * im);
    }
}
