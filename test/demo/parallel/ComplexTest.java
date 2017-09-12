package demo.parallel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {
    @Test
    void div() {
        Complex a0 = new Complex(-2, 1);
        Complex b0 = new Complex(1, -1);
        Complex r0 = new Complex(-1.5, -0.5);


        Complex a1 = new Complex(-2, 1);
        Complex b1 = new Complex(0, 0);

        assertAll("Divide operation test",
                () -> assertEquals(a0.div(b0), r0, "Divide operation test"),
                () -> assertThrows(ArithmeticException.class, () -> a1.div(b1)));
    }

    @Test
    void sin() {
        Complex a0 = new Complex(0, 0);
        Complex r0 = new Complex(0, 0);

        Complex a1 = new Complex(3, 5);
        Complex r1 = new Complex(10.47, -73.46);

        assertAll("Sine function test",
                () -> assertEquals(a0.sin(), r0),
                () -> assertEquals(a1.sin(), r1));
    }

    @Test
    void cos() {
        Complex a0 = new Complex(0, 0);
        Complex r0 = new Complex(1, 0);

        Complex a1 = new Complex(5, -5.32);
        Complex r1 = new Complex(28.99, -97.99);

        assertAll("Sine function test",
                () -> assertEquals(a0.cos(), r0),
                () -> assertEquals(a1.cos(), r1));
    }

}