package demo.parallel;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ComplexTest {
    private Complex c1;
    private Complex c2;

    @BeforeEach
    void setUp(){
        c1 = new Complex(7.0,15.0);
        c2 = new Complex(6.0, 12.0);
    }

    @Test
    void divide() {
        Complex temp = c1.divide(c2);
        assertEquals(temp.getRe(), 222.0/180.0,
                "Real part of first complex has wrong value (in Complex.division(Complex))");
        assertEquals(temp.getIm(), 174.0/180.0,
                "Imaginary part of first complex has wrong value (in Complex.division(Complex))");
        assertThrows(ArithmeticException.class, () -> c1.divide(new Complex(0, 0)),
                "Division by zero in Complex.division(Complex)");
    }

    @Test
    void minus() {
        Complex temp = c1.minus(c2);
        assertEquals(temp.getRe(), 1.0,
                "Real part of first complex has wrong value (in Complex.sub(Complex))");
        assertEquals(temp.getIm(), 3.0,
                "Imaginary part of first complex has wrong value (in Complex.sub(Complex))");
    }







}