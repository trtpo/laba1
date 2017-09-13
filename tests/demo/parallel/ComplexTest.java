package demo.parallel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ComplexTest {
    private Complex z1;
    private Complex z2;

    @BeforeEach
    void setUp() {
        z1 = new Complex(-1, 3);
        z2 = new Complex(2, -13);
    }

    @Test
    void divide() {
        Complex temp = z1.divide(z2);
        assertEquals(temp.getRe(), -41.0 / 173.0, "First pair result real part has wrong value (in Complex.divide(Complex))");
        assertEquals(temp.getIm(), -7.0 / 173.0, "First pair result imaginary part has wrong value (in Complex.divide(Complex))");
        assertThrows(ArithmeticException.class, () -> z1.divide(new Complex(0, 0)), "Division by zero in Complex.divide(Complex)");
    }

    @Test
    void minus() {
        Complex temp = z1.minus(z2);
        assertEquals(temp.getRe(), -3.0, "First pair result real part has wrong value (in Complex.minus(Complex))");
        assertEquals(temp.getIm(), 16.0, "First pair result imaginary part has wrong value (in Complex.minus(Complex))");
    }
}