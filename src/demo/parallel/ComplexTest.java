import demo.parallel.Complex;

import static org.junit.jupiter.api.Assertions.*;

class TestComplex {
    @org.junit.jupiter.api.Test
    void plus() {
        Complex testComplex = new Complex(3, 5);
        testComplex.plus(new Complex(2, 1));

        assertEquals(testComplex.getIm(), 7);
        assertEquals(testComplex.getRe(), 7);
    }

    @org.junit.jupiter.api.Test
    void minus() {
        Complex testComplex = new Complex(3, 5);

        testComplex.minus(new Complex(2, 1));
        assertEquals(testComplex.getIm(), 4);
        assertEquals(testComplex.getRe(), 2);
    }

    @org.junit.jupiter.api.Test
    void div() {
        Complex testComplex = new Complex(3, 5);

        testComplex.div(new Complex(2, 1));
        assertEquals(testComplex.getIm(), -7);
        assertEquals(testComplex.getRe(), 12);
    }

    @org.junit.jupiter.api.Test
    void times() {
        Complex testComplex = new Complex(3, 5);

        testComplex.times(new Complex(2, 1));
        assertEquals(testComplex.getIm(), 14);
        assertEquals(testComplex.getRe(), 3);
    }
}