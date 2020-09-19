package demo.parallel;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class ComplexTest {


    @Test
    void powNegative() {
        Complex complex = new Complex(1.0, 1.0);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            complex.pow(-10);
        });
    }

    @Test
    void pow0() {
        Complex complex = new Complex(1.0, 1.0);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            complex.pow(0);
        });
    }

    @Test
    void pow1() {
        Complex complex = new Complex(1.0, 1.0);
        complex.pow(1);

        Assertions.assertEquals(complex, new Complex(1.0, 1.0));
    }

    @Test
    void pow2() {
        Complex complex = new Complex(1.0, 1.0);
        complex.pow(2);

        Assertions.assertEquals(complex, new Complex(0.0, 2.0));
    }

    @Test
    void pow3() {
        Complex complex = new Complex(1.0, 1.0);
        complex.pow(3);

        Assertions.assertEquals(complex, new Complex(-2.0, 2.0));
    }

    @Test
    void pow10() {
        Complex complex = new Complex(-1.0, 2.0);
        complex.pow(10);

        Assertions.assertEquals(complex, new Complex(237.0, 3116));
    }
}