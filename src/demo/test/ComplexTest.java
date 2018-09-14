package demo.test;


import demo.parallel.Complex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

class ComplexTest {
    private static Random random;

    @BeforeAll
    static void init() {
        random = new Random();
    }

    @Test
    void divideComplexNumberTest() {
        Complex numerator = new Complex(-2, 1);
        Complex denominator = new Complex(1, -1);
        Assertions.assertEquals(numerator.divide(denominator), new Complex(-1.5, -0.5));
    }

    @Test
    void divideIntegerNumberTest() {
        Complex numerator = new Complex(10, 0);
        Complex denominator = new Complex(2, 0);
        Assertions.assertEquals(numerator.divide(denominator), new Complex(5.0, 0.0));
    }

    @Test
    void divideImaginaryPosNumberTest() {
        Complex numerator = new Complex(0, 3.5);
        Complex denominator = new Complex(0, 8);
        Assertions.assertEquals(numerator.divide(denominator), new Complex
                (0.4375, 0.0));
    }


    @Test
    void divideZeroNumberTest() {
        double re = random.nextDouble();
        double im = random.nextDouble();
        Complex numerator = new Complex(0, 0);
        Complex denominator = new Complex(re, im);
        Assertions.assertEquals(numerator.divide(denominator), new Complex(0.0, 0.0));
    }


}