package demo.parallel;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexTest {

    @Test
    void abs() throws Exception{
        double re = 1;
        double im = 2;
        assertEquals(2.23606797749979,Math.hypot(re, im));
    }

    @Test
    void phase() {
        double re = 90;
        double im = 15;
        double result = Math.atan2(re,im);
        assertEquals(Math.atan2(90,15),result);
    }

    @Test
    void minus() {
        assertEquals(5,5);
    }

    @Test
    void scale() {
        double re = 1;
        double im = 2;
        double scale = re*re + im*im;
        Complex comp= new Complex(re / scale, -im / scale);
        assertEquals(new Complex(0.2,-0.4),comp);
    }

    @Test
    void conjugate() {
        double re = 1;
        double im = 2;
        assertEquals(new Complex(1,-2),new Complex(re,-im));
    }

    @Test
    void reciprocal() {
        double re = 1;
        double im = 2;
        double scale = re*re + im*im;
        Complex result = new Complex(re / scale, -im / scale);
        assertEquals(new Complex(0.2,-0.4),result);
    }

    @Test
    void exp() {
        double re = 1;
        double im = 2;
        Complex result = new Complex(Math.exp(re) * Math.cos(im), Math.exp(re) * Math.sin(im));
        assertEquals(new Complex(Math.exp(1) * Math.cos(2), Math.exp(1) * Math.sin(2)),result);
    }

    @Test
    void sin() {
        double re = 1;
        double im = 2;
        Complex result = new Complex(Math.sin(re) * Math.cosh(im), Math.cos(re) * Math.sinh(im));
        assertEquals(new Complex(Math.sin(1) * Math.cosh(2), Math.cos(1) * Math.sinh(2)),result);
    }

    @Test
    void cos() {
        double re = 1;
        double im = 2;
        Complex result = new Complex(Math.cos(re) * Math.cosh(im), -Math.sin(re) * Math.sinh(im));
        assertEquals(new Complex(Math.cos(1) * Math.cosh(2), -Math.sin(1) * Math.sinh(2)),result);
    }

    @Test
    void tan() {
        double re = 1;
        double im = 2;
    }

    @org.junit.jupiter.api.Test
    void lengthSQ() {
        double re = 1;
        double im = 2;
        double result = re*re+im*im;
        assertEquals(5,re*re+im*im);
    }
}
