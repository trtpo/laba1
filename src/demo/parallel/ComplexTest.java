package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void divideTestPositiveRealAndNegativeImaginary() {
        Complex a = new Complex(7, -4);
        Complex b = new Complex(3, 2);

        assertEquals(new Complex(1, -2),a.divide(b));
    }
    @Test
    void divideTestPositiveRealAndPositiveImaginary() {
        Complex a = new Complex(2, 1);
        Complex b = new Complex(2,1);

        assertEquals(new Complex(1, 0),a.divide(b));
    }

    @Test
    void divideTestZeroDivider() {
        Complex a = new Complex(-2, -1);
        Complex b = new Complex(0,0);

        assertThrows(NumberFormatException.class, ()->a.divide(b));
    }
}