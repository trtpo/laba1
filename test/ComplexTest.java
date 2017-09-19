package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    private Complex c;
    private Complex d;

    @Before
    public void setUp() throws Exception {
        c = new Complex(-10, 3);
        d = new Complex(25, 45);
    }

    @Test
    public void minusTest() throws Exception {
        Complex res = c.minus(d);
        assertEquals("minus operation test on 80th line", -35.0, res.getReal(), 0.01);
        assertEquals("minus operation test on 81th line", 48.0, res.getImaginary(), 0.01);
    }

    @Test
    public void divideTest() throws Exception {
        Complex res = c.divide(d);
        assertEquals("divide operation test on 109th line", -0.043, res.getReal(), 0.001);
        assertEquals("divide operation test on 110th line", -0.022, res.getImaginary(), 0.001);
    }
}
