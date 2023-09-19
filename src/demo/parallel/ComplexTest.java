package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class ComplexTest {
    @Test
    public void testMinus() {
        Complex a = new Complex(5, 3);
        Complex b = new Complex(2, 1);
        Complex result = a.minus(b);

        assertEquals(3, result.getRe(),0.1);
        assertEquals(2, result.getIm(), 0.1);
    }

    @Test
    public void testDivide() {
        Complex a = new Complex(4, 2);
        Complex b = new Complex(2, 1);
        Complex expected = new Complex(2, 0.0);

        Complex result = a.divide(b);

        assertEquals(expected.getRe(), result.getRe(), 0.0001);
        assertEquals(expected.getIm(), result.getIm(), 0.0001);
    }
}