package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    private double testRe = 0;
    private double testIm = 0;

    @Test
    public void plus() throws Exception {
        Complex testComplex = new Complex(1.4, 2.8);

        testRe = 5.0;
        testIm = 14.1;

        testComplex.plus(new Complex(3.6, 11.3));
        assertEquals(testRe, testComplex.getRe(), 0.0005);
        assertEquals(testIm, testComplex.getIm(), 0.0005);
    }

    @Test
    public void times() throws Exception {
        Complex testComplex = new Complex(1.4, 2.8);

        testRe = -26.6;
        testIm = 25.9;

        testComplex.times(new Complex(3.6, 11.3));
        assertEquals(testRe, testComplex.getRe(), 0.0005);
        assertEquals(testIm, testComplex.getIm(), 0.0005);
    }

    @Test
    public void scale() throws Exception {
        Complex testComplex = new Complex(1.4, 2.8);
        Complex testComplexTemp;

        testRe = 1.82;
        testIm = 3.64;

        testComplexTemp = testComplex.scale(1.3);
        assertEquals(testRe, testComplexTemp.getRe(), 0.0005);
        assertEquals(testIm, testComplexTemp.getIm(), 0.0005);

    }

    @Test
    public void exp() throws Exception {
        Complex testComplex = new Complex(1.4, 2.8);
        Complex testComplexTemp;

        testRe = -3.82;
        testIm = 1.36;

        testComplexTemp = testComplex.exp();
        assertEquals(testRe, testComplexTemp.getRe(), 0.05);
        assertEquals(testIm, testComplexTemp.getIm(), 0.05);

    }

    @Test
    public void sin() throws Exception {
        Complex testComplex = new Complex(1.4, 2.8);
        Complex testComplexTemp;

        testRe = 8.13;
        testIm = 1.39;

        testComplexTemp = testComplex.sin();
        assertEquals(testRe, testComplexTemp.getRe(), 0.05);
        assertEquals(testIm, testComplexTemp.getIm(), 0.05);

    }
}