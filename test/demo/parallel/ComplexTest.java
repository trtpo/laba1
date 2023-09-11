package demo.parallel;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void multiplyInt() {
        Complex c1 = new Complex(1, 1).multiply(5);
        Complex c2 = new Complex(23.99, 0.61).multiply(5);

        assertEquals(c1.getRe(), 5, 0.0000000001);
        assertEquals(c1.getIm(), 5, 0.0000000001);
        assertEquals(c2.getRe(), 119.95, 0.0000000001);
        assertEquals(c2.getIm(), 3.05, 0.0000000001);
    }

    @org.junit.jupiter.api.Test
    void multiplyDouble() {
        Complex c1 = new Complex(1, 1).multiply(44.03);
        Complex c2 = new Complex(23.99, 0.61).multiply(44.03);

        assertEquals(c1.getRe(), 44.03, 0.0000000001);
        assertEquals(c1.getIm(), 44.03, 0.0000000001);
        assertEquals(c2.getRe(), 1056.2797, 0.0000000001);
        assertEquals(c2.getIm(), 26.8583, 0.0000000001);
    }

    @org.junit.jupiter.api.Test
    void multiplyNegative() {
        Complex c1 = new Complex(1, 1).multiply(-44.03);
        Complex c2 = new Complex(23.99, 0.61).multiply(-44.03);

        assertEquals(c1.getRe(), -44.03, 0.0000000001);
        assertEquals(c1.getIm(), -44.03, 0.0000000001);
        assertEquals(c2.getRe(), -1056.2797, 0.0000000001);
        assertEquals(c2.getIm(), -26.8583, 0.0000000001);
    }

    @org.junit.jupiter.api.Test
    void multiplyZero() {
        Complex c1 = new Complex(1, 1).multiply(0);
        Complex c2 = new Complex(23.99, 0.61).multiply(0);

        assertEquals(c1.getRe(), 0, 0.0000000001);
        assertEquals(c1.getIm(), 0, 0.0000000001);
        assertEquals(c2.getRe(), 0, 0.0000000001);
        assertEquals(c2.getIm(), 0, 0.0000000001);
    }

}