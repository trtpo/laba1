package demo.parallel;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void minus() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(3, 4);
        Complex actual = a.minus(b);
        Complex expected = new Complex(-2, -3);
        assertEquals(expected.getIm(), actual.getIm());
        assertEquals(expected.getRe(), actual.getRe());
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Complex a = new Complex(1,1);
        Complex b = new Complex(1,1);
        Complex actual = a.divide(b);
        Complex expected = new Complex(1,0);
        assertEquals(expected.getIm(), actual.getIm());
        assertEquals(expected.getRe(), actual.getRe());
    }
}