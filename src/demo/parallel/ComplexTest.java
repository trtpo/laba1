package demo.parallel;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ComplexTest {

    @Test
    public void subTest() {
        Complex a = new Complex(8.8, 1.2);
        Complex b = new Complex(16.9, 10.0);

        Complex result = a.sub(b);

        assertEquals(8.8 - 16.9, result.getRe(), 0.0001);
        assertEquals(1.2 - 10.0, result.getIm(), 0.0001);
    }

    @Test
    public void divTest() {
        Complex a = new Complex(5, 6);
        Complex b = new Complex(7, 8);

        Complex result = a.div(b);

        assertEquals(83 / 113.0, result.getRe(), 0.0001);
        assertEquals(2 / 113.0, result.getIm(), 0.0001);

    }
}