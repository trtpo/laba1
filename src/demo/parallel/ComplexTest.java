package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void plus() {
        Complex cmplx = new Complex(13,2);
        cmplx.plus(14);
        assertEquals(cmplx.getRe(), 27);
        assertEquals(cmplx.getIm(), 2);

        cmplx.plus(3);
        assertEquals(cmplx.getRe(), 30);
        assertEquals(cmplx.getIm(), 2);
    }

    @org.junit.jupiter.api.Test
    void times() {
        Complex cmplx = new Complex(13,2);
        cmplx.times(4);
        assertEquals(cmplx.getRe(), 52);
        assertEquals(cmplx.getIm(), 8);
    }
}