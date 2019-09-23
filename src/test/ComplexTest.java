package test;

import demo.parallel.Complex;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void divideZeroFirst() {
        Complex a = new Complex(0, 0);
        Complex b = new Complex(2, 3);
        assertEquals(new Complex(0, 0), a.divide(b));
    }

    @org.junit.jupiter.api.Test
    void divideZeroSecond() {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(0, 0);
        assertEquals(new Complex(1, 1), a.divide(b));
    }

    @org.junit.jupiter.api.Test
    void divideZeroBoth() {
        Complex a = new Complex(0, 0);
        Complex b = new Complex(0, 0);
        assertEquals(new Complex(1, 1), a.divide(b));
    }

    @org.junit.jupiter.api.Test
    void divideOrdinary() {
        Complex a = new Complex(100, 50);
        Complex b = new Complex(6, 8);
        assertEquals(new Complex(10, -5), a.divide(b));
    }
}