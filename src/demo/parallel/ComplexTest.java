package demo.parallel;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ComplexTest {
    private Complex complex;

    @Before
    public void init() {
        complex = new Complex(5, 10);
    }

    @Test
    public void plus() throws Exception {
        Complex result = complex.plus(new Complex(10, 5));
        assertEquals(15, complex.getRe(), 0.000001);
        assertEquals(15, complex.getIm(), 0.000001);
    }

    @Test
    public void minus() throws Exception {
        Complex result = complex.minus(new Complex(10, 5));
        assertEquals(-5, complex.getRe(), 0.000001);
        assertEquals(+5, complex.getIm(), 0.000001);
    }

    @Test public void divide() throws Exception {
        Complex result = complex.divide(new Complex(10, 5));
        assertEquals(0.8, complex.getRe(), 0.001);
        assertEquals(0.6, complex.getIm(), 0.001);
    }
}
