package test;

import demo.parallel.Complex;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {

    private static Complex complexA;
    private static Complex complexB;

    @BeforeClass
    public static void setUp() {
        complexA = new Complex(4,6);
        complexB = new Complex(3,2);
    }

    @Test
    public void minus() {
        Complex result = complexA.minus(complexB);
        assertEquals(result.getRe(), 1, 0.001);
        assertEquals(result.getIm(), 4, 0.001);
    }

    @Test
    public void divide() {
        Complex result = complexA.divide(complexB);
        assertEquals(result.getRe(), 1.846, 0.1);
        assertEquals(result.getIm(), 0.769, 0.1);
    }

    @Test
    public void divideByZero() {
        Complex result = complexA.divide(new Complex(0, 0));
        assertEquals(result.getRe(), Double.NaN, 0);
        assertEquals(result.getIm(), Double.NaN, 0);
    }
}
