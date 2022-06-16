package demo.parallel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class ComplexTest {
    private Complex complex;
    
    @BeforeEach
    void init() {
        complex = new Complex(1.0, 1.0);
    }

    @Test
    void plus() {
        complex.plus(new Complex(1.0, 1.0));
        Assertions.assertEquals(complex, new Complex(2.0, 2.0));
    }

    @Test
    void plus2() {
        complex.plus(new Complex(-1.0, 2.0));
        Assertions.assertEquals(complex, new Complex(0.0, 3.0));
    }

    @Test
    void powNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            complex.pow(-5);
        });
    }

    @Test
    void pow1() {
        complex.pow(1);
        Assertions.assertEquals(complex, new Complex(1.0, 1.0));
    }

    @Test
    void pow2() {
        complex.pow(2);
        Assertions.assertEquals(complex, new Complex(0.0, 2.0));
    }

    @Test
    void pow3() {
        complex.pow(3);
        Assertions.assertEquals(complex, new Complex(-2.0, 2.0));
    }

    @Test
    void rotate() {
        complex.rotate(Math.PI);
        Assertions.assertEquals(complex, new Complex(-1.0, -1.0));
    }

    @Test
    void rotatePi2() {
        complex.rotate(Math.PI / 2);
        Assertions.assertEquals(complex, new Complex(-1.0, 1.0));
    }

    @Test
    void rotate0() {
        complex.rotate(0);
        Assertions.assertEquals(complex, new Complex(1.0, 1.0));
    }
}