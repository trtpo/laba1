package demo.parallel;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ComplexTest {
    private Complex complex1;
    private Complex complex2;
    @BeforeEach
    public void setUp(){
        complex1 = new Complex(5, -4);
        complex2 = new Complex(2, 1);
    }

    @Test
    public void sub() {
        Complex temp = complex1.sub(complex2);
        assertEquals(temp.getRe(), 3.0, "Real part of first complex has wrong value (in Complex.sub(Complex))");
        assertEquals(temp.getIm(), -5.0, "Imaginary part of first complex has wrong value (in Complex.sub(Complex))");
    }

    @Test
    public void division() {
        Complex temp = complex1.division(complex2);
        assertEquals(temp.getRe(), 1.2, "Real part of first complex has wrong value (in Complex.division(Complex))");
        assertEquals(temp.getIm(), -2.6, "Imaginary part of first complex has wrong value (in Complex.division(Complex))");
        assertThrows(ArithmeticException.class, () -> complex1.division(new Complex(0, 0)), "Division by zero in Complex.division(Complex)");
    }

}
