package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void minus() {
        Complex a = new Complex(5.0, 3.0);
        Complex b = new Complex(2.0, 1.0);
        a.minus(b);
        assertEquals(3.0, a.getRe());
        assertEquals(2.0, a.getIm());
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Complex a = new Complex(5.0, 3.0);
        Complex b = new Complex(2.0, 1.0);
        a.divide(b);
        assertEquals(2.6, a.getRe(), 0.01);
        assertEquals(0.2, a.getIm(), 0.01);
    }
}