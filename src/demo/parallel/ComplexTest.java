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
    void minus() {
        Complex a = new Complex(7,7);
        Complex b = new Complex(3,3);
        Complex c = new Complex(4,4);
        a = a.minus(b);
        assertEquals(a.getRe(),c.getRe());
        assertEquals(a.getIm(),c.getIm());
    }

   
}