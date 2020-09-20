package Test;

import demo.parallel.Complex;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void plus() {
        Complex testComplex = new Complex(4, 5);
        testComplex.plus(new Complex(2, 1));

        assertEquals(testComplex.getIm(), 6);
        assertEquals(testComplex.getRe(), 6);
    }

    @org.junit.jupiter.api.Test
    void minus() {
        Complex testComplex = new Complex(4, 5);
        testComplex.minus(new Complex(2, 1));

        assertEquals(testComplex.getIm(), 4);
        assertEquals(testComplex.getRe(), 2);
    }

    @org.junit.jupiter.api.Test
    void div() {
        Complex testComplex = new Complex(4, 5);
        testComplex.div(new Complex(2, 1));

        assertEquals(testComplex.getIm(), -6);
        assertEquals(testComplex.getRe(), 13);
    }

    @org.junit.jupiter.api.Test
    void times() {
        Complex testComplex = new Complex(4, 5);
        testComplex.times(new Complex(2, 1));

        assertEquals(testComplex.getIm(), 14);
        assertEquals(testComplex.getRe(), 3);
    }
}