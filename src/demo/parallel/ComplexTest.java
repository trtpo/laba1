package demo.parallel;

import static org.junit.Assert.*;

public class ComplexTest {

    @org.junit.Test
    public void subTest() {
        Complex a = new Complex(6.3, 7.8);
        Complex b = new Complex(5.7, 9.4);
        //Complex expected = new Complex(0.6, -1.6);
        Complex actual = a.sub(b);
        double expectedRe = 0.6;
        double expectedIm = -1.6;
        assertEquals(expectedRe, actual.getRe(), 0.1);
        assertEquals(expectedIm, actual.getIm(), 0.1);
    }

    @org.junit.Test
    public void mod() {
        Complex a = new Complex(8.6, -6.2);
        double expected = 10.602;
        assertEquals(expected, a.mod(), 0.001);
    }

    @org.junit.Test
    public void div() {
        Complex a = new Complex(6.3, 7.8);
        Complex b = new Complex(5.7, 9.4);
        Complex actual = a.div(b);
        double expectedRe = 0.9;
        double expectedIm = -0.12;
        assertEquals(expectedRe, actual.getRe(), 0.1);
        assertEquals(expectedIm, actual.getIm(), 0.1);
    }
}