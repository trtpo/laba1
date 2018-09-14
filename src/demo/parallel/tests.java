package demo.parallel;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class tests {
    private Complex a;
    private Complex b;

    @Before
    public void testSetup() throws Exception {
        a = new Complex(23, 15);
        b = new Complex(11, 7);
    }

    @Test
    public void plusTest() throws Exception {
        a.plus(b);
        assertEquals(" plus operation Re", 34, a.getReal(), 0.001);
        assertEquals(" plus operation Im", 22, a.getImag(), 0.001);
    }

    @Test
    public void minusTest() throws Exception {
        a.minus(b);
        assertEquals(" minus operation Re", 12, a.getReal(), 0.001);
        assertEquals(" minus operation Im", 8, a.getImag(), 0.001);
    }

}