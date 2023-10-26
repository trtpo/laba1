package demo.parallel;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComplexTest {

    @Test
    public void testPlus() {
        Complex a = new Complex(2.0, 3.0);
        Complex b = new Complex(1.0, 2.0);

        Complex result = a.plus(b);

        assertEquals(3.0, result.getRe(), 0.001);
        assertEquals(5.0, result.getIm(), 0.001);
    }

    @Test
    public void testTimes() {
        Complex a = new Complex(2.0, 3.0);
        Complex b = new Complex(1.0, 2.0);

        Complex result = a.times(b);

        assertEquals(-4.0, result.getRe(), 0.001);
        assertEquals(7.0, result.getIm(), 0.001);
    }

    @Test
    public void testDivision() {
        Complex a = new Complex(3.0, 4.0); // 3 + 4i
        Complex b = new Complex(1.0, 2.0); // 1 + 2i

        Complex result = a.division(b);

        Assert.assertEquals(1.6, result.getRe(), 0.0001);
        Assert.assertEquals(0.8, result.getIm(), 0.0001);
    }

}
