package demo.parallel;

import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {
    @Test
    public void subtraction() throws Exception {
        Complex a = new Complex(5, 9);
        Complex b = new Complex(19, 8);
        Complex res = new Complex( -14, 1);
        assertEquals(a.subtraction(b),res);
    }

    @Test
    public void division() throws Exception {
        Complex a = new Complex(12, 8);
        Complex b = new Complex(4, 8);
        Complex res = new Complex(1.4, -0.8);
        assertEquals(res,a.division(b));
    }
}
