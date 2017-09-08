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
        assertEquals("minus opertaion test", 11.0, res.getReal(), 0.01);
        assertEquals("minus opertaion test", 258.0, res.getImaginary(), 0.01);
    }

    @Test
    public void division() throws Exception {
        Complex res = c.division(d);
        assertEquals("minus opertaion test", 0.048, res.getReal(), 0.001);
        assertEquals("minus opertaion test", 0.053, res.getImaginary(), 0.001);

    }
}
