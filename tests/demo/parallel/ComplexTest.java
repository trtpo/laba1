package demo.parallel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {
    Complex complexA;
    Complex complexB;
    Complex complexTest;
    double delta;

    @BeforeEach
    void setUp() throws Exception {
        complexA = new Complex(-2,1);
        complexB = new Complex(1, -1);
        complexTest = new Complex(4, 3);
        delta = 5;
    }

    @Test
    void minus() {
        complexA.minus(complexTest);
        assertEquals(-6, complexA.getRe(), delta);
        assertEquals(-2, complexA.getIm(), delta);
    }

    @Test
    void divide() {
        complexA.divide(complexB);
        assertEquals(-1.5, complexA.getRe(), delta);
        assertEquals(-0.5, complexA.getIm(), delta);
    }

    @Test
    void abs() {
        assertEquals(5, complexTest.abs(), delta);
    }
}