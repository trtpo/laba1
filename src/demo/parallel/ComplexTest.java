package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void plus() {
        Complex a = new Complex(4,4);
        Complex b = new Complex(3,3);
        Complex c = new Complex(7,7);
        a = a.plus(b);
        assertEquals(a.getRe(),c.getRe());
        assertEquals(a.getIm(),c.getIm());
    }

    @org.junit.jupiter.api.Test
     void cos() {
        Complex a = new Complex(2.7, 6);
        Complex b = a.cos();
        assertTrue(b.isEqual(new Complex(Math.cos(a.getRe()) * Math.cosh(a.getIm()), -Math.sin(a.getRe()) * Math.sinh(a.getIm()))));
    }

    @org.junit.jupiter.api.Test
    void IsEqual() {
        Complex a = new Complex(2.7, 6);
        Complex b = new Complex(2.7, 6);
        assertTrue(a.isEqual(b));
    }
}