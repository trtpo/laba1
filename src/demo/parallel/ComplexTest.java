package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void minus() {
        Complex a = new Complex(4.6, 3.5);
        Complex b = new Complex(5.1,7.3);
        Complex actual = a.minus(b);
        double reExpected = -0.5;
        double imExpected = -3.8;
        assertEquals(reExpected, actual.getRe(), 0.1);
        assertEquals(imExpected, actual.getIm(), 0.1);
    }

    @Test
    void divide() {
        Complex a = new Complex(3.2, 1.9);
        Complex b = new Complex(1.6,3.8);
        Complex actual = a.divide(b);
        double reExpected = 0.734;
        double imExpected = -0.494;
        assertEquals(reExpected, actual.getRe(), 0.1);
        assertEquals(imExpected, actual.getIm(), 0.1);
    }
}