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
    public void minus() throws Exception {
        Complex res = c.minus(d);
        assertEquals("minus operation test real part", 11.0, res.getReal(), 0.01);
        assertEquals("minus operation test imaginary part", 258.0, res.getImaginary(), 0.01);
    }

    @Test
    public void division() throws Exception {
        Complex res = c.divide(d);
        assertEquals("divide operation test real part", 0.048, res.getReal(), 0.001);
        assertEquals("divide operation test imaginary part", 0.053, res.getImaginary(), 0.001);
        assertEquals("divide operation test real part", 0.148, res.getReal(), 0.001);
        assertEquals("divide operation test imaginary part", 0.253, res.getImaginary(), 0.001);
    }
}
