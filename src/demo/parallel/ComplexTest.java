package demo.parallel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ComplexTest {

    private Complex z1;
    private Complex z2;

    @BeforeEach
    public void init() {
        z1 = new Complex(4, 8);
        z2 = new Complex(-5, 4);
    }

    @Test
    public void subtraction() {
        z1.minus(z2);
        assertEquals(z1.getReal(), 9.0, "Real part of result is wrong (in Complex.minus(Complex b))");
        assertEquals(z1.getImage(), 4.0, "Imaginary part of result is wrong (in Complex.minus(Complex b))");
    }

    @Test
    public void division() {
        z1.divide(z2);
        assertEquals(z1.getReal(), 12.0 / 41.0, "Real part of result is wrong (in Complex.division(Complex b))");
        assertEquals(z1.getImage(), -56.0 / 41.0, "Imaginary part of result is wrong (in Complex.division(Complex b))");
    }

    @Test
    public void divisionByZero() {
        Complex zero = new Complex(0, 0);
        Throwable exception = assertThrows(ArithmeticException.class, () -> {
            z1.divide(zero);
        });
        assertEquals("Division by Complex(0, 0)", exception.getMessage(),
                "Unexpected exception (in Complex.division(Complex b))");
    }
}
