package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void plus() {
        Complex a = new Complex(2.0, 3.0);
        Complex b = new Complex(1.0, 4.0);
        Complex result = a.plus(b);

        assertEquals(3.0, result.getRe(), 0.01);
        assertEquals(7.0, result.getIm(), 0.01);
    }

    @org.junit.jupiter.api.Test
    void times() {
        Complex a = new Complex(2.0, 3.0);
        Complex b = new Complex(1.0, 4.0);
        Complex result = a.times(b);

        assertEquals(-10.0, result.getRe(), 0.01);
        assertEquals(11.0, result.getIm(), 0.01);
    }

    @org.junit.jupiter.api.Test
    void minus() {
        Complex a = new Complex(5.0, 7.0);
        Complex b = new Complex(2.0, 3.0);
        Complex result = a.minus(b);

        assertEquals(3.0, result.getRe(), 0.01);
        assertEquals(4.0, result.getIm(), 0.01);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Complex a = new Complex(6.0, 8.0);
        Complex b = new Complex(2.0, 2.0);
        Complex result = a.divide(b);

        assertEquals(4.0, result.getRe(), 0.01);
        assertEquals(0.0, result.getIm(), 0.01);
    }

    @org.junit.jupiter.api.Test
    void lengthSQ() {
        Complex a = new Complex(3.0, 4.0);
        double result = a.lengthSQ();

        assertEquals(25.0, result, 0.01);
    }
}