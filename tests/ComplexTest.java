import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import demo.parallel.Complex;

public class ComplexTest {

    @Test
    public void testSub() {
        Complex a = new Complex(5, 38);
        Complex b = new Complex(4, 28);
        a.sub(b);
        assertEquals(a.getRe(), 1);
        assertEquals(a.getIm(), 10);
    }

    @Test
    public void testAbs() {
        Complex a = new Complex(6, 8);
        assertEquals(a.abs(), 10.0);
    }
}