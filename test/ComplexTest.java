package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    private Complex c;
    private Complex d;

    @Before
    public void setUp() throws Exception {
        c = new Complex(-12, 13);
        d = new Complex(23, 245);
    }

    @Test
    public void minusTest() throws Exception {
        Complex res = c.minus(d);
        assertEquals("minus operation test real part in minus function on line 96", -35.0, res.getReal(), 0.01);
        assertEquals("minus operation test imaginary part in minus function on line 97", -232.0, res.getImaginary(), 0.01);
    }

    @Test
    public void divideTest() throws Exception {
        Complex res = c.divide(d);
        assertEquals("divide operation test real part in divide function on line 122", 0.048, res.getReal(), 0.001);
        assertEquals("divide operation test imaginary part in divide function on line 123", 0.053, res.getImaginary(), 0.001);
    }
}
