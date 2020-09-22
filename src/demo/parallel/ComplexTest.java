package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void plus() {
        Complex a = new Complex(1.0,1.0);
        Complex b = new Complex(2.0,2.0);
        Complex sum = new Complex(3.0,3.0);
        a=a.plus(b);
        assertEquals(a.getRe(),sum.getRe(), 0);
        assertEquals(a.getIm(),sum.getIm(), 0);
    }

    @org.junit.jupiter.api.Test
    void times() {
        Complex a = new Complex(1.0,1.0);
        Complex b = new Complex(2.0,2.0);
        Complex mul = new Complex(0.0,4.0);
        a=a.times(b);
        assertEquals(a.getRe(),mul.getRe(), 0);
        assertEquals(a.getIm(),mul.getIm(), 0);
    }

    @org.junit.jupiter.api.Test
    void cos() {
        Complex a = new Complex(2.7, 6);
        Complex b = a.cos();
        assertTrue(b.isEqual(new Complex(Math.cos(a.getRe()) * Math.cosh(a.getIm()), -Math.sin(a.getRe()) * Math.sinh(a.getIm()))));
    }
}