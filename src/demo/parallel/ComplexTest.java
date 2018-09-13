package demo.parallel;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexTest {
    private Complex num1;
    private Complex num2;

    @Before
    public void init() {
        num1 = new Complex(Math.sqrt(2), -0.5);
        num2 = new Complex(1, 1);
    }

    @Test
    public void sin() {
        Complex res = num1.sin();
        assertEquals(Math.toRadians(45), res.getRe(), 2);
        assertEquals(0, res.getIm(), 3);
    }

    @Test
    public void cos() {
        Complex res = num2.cos();
        assertEquals(Math.toRadians(90), res.getRe(), 2);
        assertEquals(0, res.getIm(), 3);
    }

    @Test
    public void sub() {
        Complex res = num1.sub(num2);
        assertEquals(Math.sqrt(2)-1, res.getRe(), 0);
        assertEquals(-1.5, res.getIm(), 0);
    }
}
