package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void plus() {
        Complex testComplex = new Complex(4, 5);
        testComplex.plus(new Complex(2, 1));

        assertEquals(testComplex.getIm(), 6);
        assertEquals(testComplex.getRe(), 6);
    }

    @Test
    void times() {
        Complex testComplex = new Complex(4, 5);
        testComplex.times(new Complex(2, 1));

        assertEquals(testComplex.getIm(), 14);
        assertEquals(testComplex.getRe(), 3);
    }

    @Test
    void sin() {
        Complex testComplex = new Complex(4, 5);
        testComplex.sin(new Complex(2, 1));

        assertEquals(testComplex.getIm(), -0.49, 0.01);
        assertEquals(testComplex.getRe(), 1.40,  0.01);
    }

    @Test
    void cos() {
        Complex testComplex = new Complex(4, 5);
        testComplex.cos(new Complex(2, 1));

        assertEquals(testComplex.getIm(), -1.07, 0.01);
        assertEquals(testComplex.getRe(), -0.65,  0.01);
    }

    @Test
    void minus() {
        Complex testComplex = new Complex(4, 5);
        testComplex.minus(new Complex(2, 1));

        assertEquals(testComplex.getIm(), 4);
        assertEquals(testComplex.getRe(), 2);
    }
}