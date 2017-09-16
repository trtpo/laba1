package demo;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ComplexTest extends Assert {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testEqualsAndClone() {
        final double startedReal = 3.8;
        final double startedImagine = 4.3;
        Complex c1 = new Complex(startedReal, startedImagine);
        Complex c2 = new Complex(startedReal, startedImagine);
        Complex c3 = c1.clone();
        Complex c4 = new Complex(startedImagine, startedReal);

        assertTrue("Object must be equal with itself", c1.equals(c1));
        assertTrue("Objects with equal constructor parameters must be equal", c1.equals(c2));
        assertTrue("Cloned object is not equal to original", c1.equals(c3));
        assertFalse("Objects with different constructor parameters must be not equal", c1.equals(c4));
        assertTrue("If c1 equals c2 => c2 equals c1", c2.equals(c1));
        assertFalse("Must be different link after clone", c3.equals((Object) c1));
    }

    @Test
    public void testCos() {
        assertTrue("Cosine of (0, 0)", (new Complex(0, 0)).cos().equals(new Complex(1, 0)));
        assertTrue("Cosine of (Pi, 0)", (new Complex(Math.PI, 0)).cos().equals(new Complex(-1, 0)));
        assertTrue("Cosine of (2 * Pi, 0)", (new Complex(Math.PI * 2, 0)).cos().equals(new Complex(1, 0)));
    }

    @Test
    public void testMinus() {
        assertTrue("(0, 0) - (2.3, 3.3)", (new Complex(0, 0)).minus(new Complex(2.3, 3.3)).equals(new Complex(-2.3, -3.3)));
        assertTrue("(1.3, 2.4) - (-1, 0)", (new Complex(1.3, 2.4)).minus(new Complex(-1, 0)).equals(new Complex(2.3, 2.4)));
    }
}
