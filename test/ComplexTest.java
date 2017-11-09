//Adding JUnit4 tests for new methods of Complex numbers:
//        - minus
//        - divide

package demo.parallel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testMinusBasic() throws Exception {
        String errorMessage = "Basic minus operation";
        Complex a = new Complex(2, 4);
        Complex b = new Complex(6, 2);
        a.minus(b);
        assertTrue(errorMessage, a.equals(new Complex(-4, 2)));
    }

    @Test
    public void testMinusNegative() throws Exception {
        String errorMessage = "Minus negative complex number";
        Complex a = new Complex(10235, -10288);
        Complex b = new Complex(-16, 2);
        a.minus(b);
        assertTrue(errorMessage, a.equals(new Complex(10251, -10290)));
    }

    @Test
    public void testDivideBasic() throws Exception {
        String errorMessage = "Basic division";
        Complex a = new Complex(3, 3);
        Complex b = new Complex(5, 7);
        a.times(b).divide(b);
        assertTrue(errorMessage, a.equals(new Complex(3, 3)));
    }

    @Test
    public void testDivideZero() throws Exception {
        String errorMessage = "Divide on zero complex number";
        Complex a = new Complex(3, 3);
        Complex b = new Complex(0, 0);
        a.divide(b);
        assertTrue(errorMessage, a.equals(new Complex(0, 0)));
    }
}