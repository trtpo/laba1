package demo.test;


import demo.parallel.Complex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

class ComplexTest {
    private static Random random;
    private static final int RANDOM_MULTIPLIER = 100;
    private static final double DELTA = 0.001;

    @BeforeAll
    static void init() {
        random = new Random();
    }

    @RepeatedTest(10)
    void minusTest() {
        double re1 = random.nextDouble() * RANDOM_MULTIPLIER;
        double im1 = random.nextDouble() * RANDOM_MULTIPLIER;
        double re2 = random.nextDouble() * RANDOM_MULTIPLIER;
        double im2 = random.nextDouble() * RANDOM_MULTIPLIER;
        Complex result = new Complex(re1, im1).minus(new Complex(re2, im2));
        Assertions.assertEquals(re1-re2, result.getRe());
        Assertions.assertEquals(im1-im2, result.getIm());
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
        Assertions.assertEquals(numerator.divide(denominator), new Complex(0.4375, 0.0));
    }


    @Test
    void divideZeroNumberTest() {
        double re = random.nextDouble() * RANDOM_MULTIPLIER;
        double im = random.nextDouble() * RANDOM_MULTIPLIER;
        Complex denominator = new Complex(re, im);
        Complex numerator = new Complex(0, 0);
        Assertions.assertEquals(numerator.divide(denominator), new Complex(0.0, 0.0));
    }


    @RepeatedTest(10)
    void powZeroPowerTest() {
        double re = random.nextDouble() * RANDOM_MULTIPLIER;
        double im = random.nextDouble() * RANDOM_MULTIPLIER;
        Complex complex = new Complex(re, im);
        Assertions.assertEquals(complex.pow(0), new Complex(1.0, 0.0));
    }

    @RepeatedTest(10)
    void powOnePowerTest() {
        double re = random.nextDouble() * RANDOM_MULTIPLIER;
        double im = random.nextDouble() * RANDOM_MULTIPLIER;
        Complex complex = new Complex(re, im);
        Complex result = complex.pow(1);
        Assertions.assertEquals(re, result.getRe(), DELTA);
        Assertions.assertEquals(im, result.getIm(), DELTA);
    }

    @RepeatedTest(10)
    void powMinusOnePowerTest() {
        double re = random.nextDouble() * RANDOM_MULTIPLIER;
        double im = random.nextDouble() * RANDOM_MULTIPLIER;
        Complex complex = new Complex(re, im);
        Complex actual = complex.pow(-1);
        Complex expected = new Complex(1, 0.0).divide(new Complex(re, im));
        Assertions.assertEquals(actual.getRe(), expected.getRe(), DELTA);
        Assertions.assertEquals(actual.getIm(), expected.getIm(), DELTA);
    }

    @Test
    void powIndexTest() {
        Complex res1 = new Complex(3., -4.).pow(1.5);
        Assertions.assertEquals(2., res1.getRe(), DELTA);
        Assertions.assertEquals(-11., res1.getIm(), DELTA);
    }

    @RepeatedTest(10)
    void sinRealNumbersTest() {
        double re = random.nextDouble() * RANDOM_MULTIPLIER;
        Complex complex = new Complex(re, 0);
        Assertions.assertEquals(Math.sin(re), complex.sin().getRe());
    }

    @Test
    void sinComplexNumbersTest() {
        Complex complex = new Complex(2, -6);
        complex.sin();
        Assertions.assertEquals(183.419, complex.getRe(), DELTA);
        Assertions.assertEquals(83.942, complex.getIm(), DELTA);
    }

    @RepeatedTest(10)
    void cosRealNumbersTest() {
        double re = random.nextDouble() * RANDOM_MULTIPLIER;
        Complex complex = new Complex(re, 0);
        Assertions.assertEquals(Math.cos(re), complex.cos().getRe());
    }

    @Test
    void cosComplexNumbersTest() {
        Complex complex = new Complex(12, 4);
        complex.cos();
        Assertions.assertEquals(23.044, complex.getRe(), DELTA);
        Assertions.assertEquals(14.643, complex.getIm(), DELTA);
    }

    @RepeatedTest(10)
    void tanRealNumbersTest() {
        double re = random.nextDouble() * RANDOM_MULTIPLIER;
        Complex complex = new Complex(re, 0).tan();
        Assertions.assertEquals(Math.tan(re), complex.getRe(), DELTA);
        Assertions.assertEquals(0, complex.getIm());
    }

    @Test
    void tanComplexNumbersTest() {
        Complex complex = new Complex(1.8, 2.5);
        complex.tan();
        Assertions.assertEquals(-0.006, complex.getRe(), DELTA);
        Assertions.assertEquals(1.012, complex.getIm(), DELTA);
    }
}