package demo.parallel;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void minus() {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        Complex expected = new Complex(2, 2);
        Complex result = c2.minus(c1);
        assertEquals(expected.getIm(), result.getIm());
        assertEquals(expected.getRe(),result.getRe());

    }

    @org.junit.jupiter.api.Test
    void divide() {
        Complex с1 = new Complex(-2, 1);
        Complex с2 = new Complex(1, -1);
        Complex expected = new Complex(-1.5, -0.5);
        Complex result = с1.divide(с2);
        assertEquals(expected.getIm(), result.getIm());
        assertEquals(expected.getRe(),result.getRe());

    }
}