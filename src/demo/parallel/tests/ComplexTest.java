package demo.parallel.tests;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {
    @Test
    public void minusTest() {
        Complex a = new Complex(6.7, 6.6);
        Complex b = new Complex(-11.4, 4.4);

        Complex result = a.minus(b);

        assertEquals(6.7 - (- 11.4), result.getRe(), 0.0001);
        assertEquals(6.6 - 4.4, result.getIm(), 0.0001);
    }

    @Test
    public void divisionTest() {
        Complex a = new Complex(2, 3);
        Complex one = new Complex(1, 1);

        a.division(one);

        assertEquals(5 / 2.0, a.getRe(), 0.0001);
        assertEquals( 1 / 2.0, a.getIm(), 0.0001);
    }
}
