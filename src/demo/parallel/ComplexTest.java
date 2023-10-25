package demo.parallel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
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
        Complex a = new Complex(2.0, 3.0);
        Complex b = new Complex(1.0, 2.0);

        Complex result = a.division(b);

        assertEquals(1.6, result.getRe(), 0.001);
        assertEquals(0.2, result.getIm(), 0.001);
    }

}
