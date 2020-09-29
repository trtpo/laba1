package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {
    @org.junit.jupiter.api.Test
    void minus() {
        Complex c = new Complex(3,4);
        Complex b = new Complex(2,2);
        Complex min = new Complex(1, 2);
        c = c.minus(b);
        assertEquals(c.re, min.re);
        assertEquals(c.im, min.im);
    }

    @org.junit.jupiter.api.Test
    void div() {
        Complex c = new Complex(10,13);
        Complex b = new Complex(7, 8);
        double real = (c.re*b.re+c.im*b.im)/(b.re*b.re+b.im*b.im);
        double imag = (c.im*b.re-c.re*b.im)/(b.re*b.re+b.im*b.im);
        c = c.div(b);
        assertEquals(c.re,real);
        assertEquals(c.im,imag);
    }
}