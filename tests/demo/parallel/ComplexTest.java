package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    private double testRe = 0;
    private double testIm = 0;

    @Test
    public void plus() throws Exception {

        testRe = 4.0;
        testIm = 6.0;

        Complex testComplex = new Complex(1.0, 2.0);
        testComplex.plus(new Complex(3.0, 4.0));

        assertEquals(testRe, testComplex.getRe(), 0.001);
        assertEquals(testIm, testComplex.getIm(), 0.001);

    }

    @Test
    public void times() throws Exception {
        testRe = -5.0;
        testIm = 10.0;

        Complex testComplex = new Complex(1.0, 2.0);
        testComplex.times(new Complex(3.0, 4.0));

        assertEquals(testRe, testComplex.getRe(), 0.001);
        assertEquals(testIm, testComplex.getIm(), 0.001);

    }

    @Test
    public void minus() throws Exception {
        testRe = -2.0;
        testIm = -2.0;

        Complex testComplex = new Complex(1.0, 2.0);
        testComplex.minus(new Complex(3.0, 4.0));

        assertEquals(testRe, testComplex.getRe(), 0.001);
        assertEquals(testIm, testComplex.getIm(), 0.001);

    }

    @Test
    public void reciprocal() throws Exception {
        testRe = 0.2;
        testIm = -0.4;

        Complex testComplex = new Complex(1.0, 2.0);
        testComplex.reciprocal();

        assertEquals(testRe, testComplex.getRe(), 0.001);
        assertEquals(testIm, testComplex.getIm(), 0.001);

    }

    @Test
    public void cos() throws Exception {
        testRe = 2.03;
        testIm = -3.248;

        Complex testComplex = new Complex(1.0, 2.0);
        testComplex.cos();

        assertEquals(testRe, testComplex.getRe(), 0.01);
        assertEquals(testIm, testComplex.getIm(), 0.01);

    }
}