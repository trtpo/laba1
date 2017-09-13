package demo.parallel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {
    private Complex complex1;
    private Complex complex2;

    @BeforeEach
    void setUp() {
        complex1 = new Complex(5.0, -4.0);
        complex2 = new Complex(2.0, 1.0);
    }

    @Test
    void sub() {
        Complex temp = complex1.sub(complex2);
        assertEquals(temp.getRe(), 3.0, "Real part of first complex has wrong value (in Complex.sub(Complex))");
        assertEquals(temp.getIm(), -5.0, "Imaginary part of first complex has wrong value (in Complex.sub(Complex))");
    }

    @Test
    void division() {
        Complex temp = complex1.division(complex2);
        assertEquals(temp.getRe(), 1.2, "Real part of first complex has wrong value (in Complex.division(Complex))");
        assertEquals(temp.getIm(), -2.6, "Imaginary part of first complex has wrong value (in Complex.division(Complex))");
        assertThrows(ArithmeticException.class, () -> complex1.division(new Complex(0, 0)), "Division by zero in Complex.division(Complex)");
    }

}