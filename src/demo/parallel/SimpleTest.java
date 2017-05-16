import demo.parallel.Complex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


@RunWith(JUnit4.class)
public class SimpleTest {
    @Test
    public void testDivision() {
        Complex c1 = new Complex(10, 10);
        Complex c2 = new Complex(20, 20);
        c2.division(c1);
        assertNotNull(c2);
        assertEquals(c2.getRe(), 10, 0);
    }
}