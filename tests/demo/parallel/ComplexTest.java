package demo.parallel;

import junit.framework.TestCase;

public class ComplexTest extends TestCase {

    public void testMinus() {
        Complex c1 = new Complex(1, 1);
        Complex c2 = new Complex(5, 2);
        assertEquals(c1.minus(c2).toString(), "-4.0|-1.0");
    }

    public void testMinus2() {
        Complex c1 = new Complex(6, 5);
        Complex c2 = new Complex(5, 2);
        assertEquals(c1.minus(c2).toString(), "1.0|3.0");
    }
}