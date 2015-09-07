package tests;

import static org.junit.Assert.assertEquals;

import demo.parallel.Complex;

import org.junit.Test;

public class UnitTests {
    //to cover all variants, STEP must be = Double.MIN_NORMAL
    //and BOUND must be = Double.MAX_VALUE
    private static final double STEP = 424.23;
    private static final double BOUND = 10000.0;

    @Test
    public static void main(String[] args) {
        System.out.println(Double.MIN_NORMAL);
        System.out.println("Starting test");
        testInversion();
        System.out.println("Finished inversion");
        testSubjugation();
        System.out.println("Finished subjungtion");
        System.out.println("Test ended");
    }

    @Test
    private static void testInversion() {
        for (double i = -BOUND; i < BOUND; i += STEP) {
            for (double j = -BOUND; j < BOUND; j += STEP) {
                Complex complex = new Complex(i, j);
                assertEquals("Complex(i, j).inverse() == Complex(j, i)", new Complex(j, i), complex.inversion());
            }
        }
    }

    @Test
    private static void testSubjugation() {
        for (double i = -BOUND; i < BOUND; i += STEP) {
            for (double j = -BOUND; j < BOUND; j += STEP) {
                testSubjugation(i, j);
            }
        }
    }

    @Test
    private static void testSubjugation(double real, double imaginary) {
        final Complex subjugated = new Complex(real, imaginary);
        for (double i = -BOUND; i < BOUND;  i+= STEP) {
            for (double j = -BOUND; j < BOUND; j += STEP) {
                Complex complex = new Complex(i, j);
                assertEquals("Complex(" + real + ", " + imaginary + ").minus(" + i + ", " + j + ") " +
                        "== Complex( " + (real - i) + ", " + (imaginary - j) + ")"
                        , subjugated.minus(complex), new Complex(real - i, imaginary - j));
            }
        }
    }
}
