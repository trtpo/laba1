package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void sin() {
        String testSinusString = new String("Basic sinus calculation operation");
        Complex a = new Complex(3, 1);
        a = a.sin();
        assertEquals(testSinusString, a.getRe(), 0.2177, 0.001);
        assertEquals(testSinusString, a.getIm(), -1.1634, 0.001);
    }

    @Test
    public void testEqualsBasic() throws Exception {
        String errorMsg = "Equals with equal complex number.";
        Complex a = new Complex(7.2,6.0);
        Complex b = new Complex(7.2,6.0);
        assertTrue(errorMsg, a.equals(b));
    }

    @Test
    public void testEqualsUnequal() throws Exception {
        String errorMsg = "Equals with unequals complex number.";
        Complex a = new Complex(4.3,3.8);
        Complex b = new Complex(4.3,-3.8);
        assertTrue(errorMsg, !a.equals(b));
    }

    @Test
    public void testEqualsNull() throws Exception {
        String errorMsg = "Equals with null complex number";
        Complex a = new Complex(1,2);
        Complex b = null;
        assertTrue(errorMsg, !a.equals(b));
    }
}