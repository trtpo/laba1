package demo;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created by AJIOB on 12.09.2017.
 *
 * @author AJIOB
 */
public class ComplexTest extends Assert {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testEqualsAndClone() {
        final double startedReal = 1.3;
        final double startedImagine = 2.7;
        Complex c1 = new Complex(startedReal, startedImagine);
        Complex c2 = new Complex(startedReal, startedImagine);
        Complex c3 = c1.clone();
        Complex c4 = new Complex(startedImagine, startedReal);

        assertTrue("Object must be equal with itself", c1.equals(c1));
        assertTrue("Objects with equal constructor parameters are equal", c1.equals(c2));
        assertTrue("Cloned object is equals to original", c1.equals(c3));
        assertFalse("Objects with different constructor parameters are not equal", c1.equals(c4));
        assertTrue("If c1 equals c2 => c2 equals c1", c2.equals(c1));
        assertFalse("Must be different link after clone", c3.equals((Object) c1));
    }

    @Test
    public void testDivide() {
        final double startedReal = 1.3;
        final double startedImagine = 2.7;
        Complex c1 = new Complex(startedReal, startedImagine);

        assertEquals("Object must return itself", c1, c1.divide(new Complex(2, 0)));
        c1 = new Complex(startedReal, startedImagine);
        assertTrue("Dividing to (2, 0)", c1.clone().divide(new Complex(2, 0))
                .equals(new Complex(startedReal / 2, startedImagine / 2)));
        assertTrue("Dividing to (1, 0)", c1.clone().divide(new Complex(1, 0))
                .equals(c1));
        assertTrue("Dividing not to real part only", c1.clone().divide(new Complex(0, -1))
                .equals(new Complex(- startedImagine, startedReal)));

        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("Divide by (0, 0)");
        c1.clone().divide(new Complex(0, 0));
    }

    @Test
    public void checkSin() {
        assertTrue("Sine of (0, 0)", (new Complex(0, 0)).sin().equals(new Complex(0, 0)));
        assertTrue("Sine of (pi/2, 0)", (new Complex(Math.PI / 2, 0)).sin().equals(new Complex(1, 0)));
        assertTrue("Sine of (3 * pi / 2, 0)", (new Complex(Math.PI * 3 / 2, 0)).sin().equals(new Complex(-1, 0)));
    }

    @Test
    public void checkCos() {
        assertTrue("Cosine of (0, 0)", (new Complex(0, 0)).cos().equals(new Complex(1, 0)));
        assertTrue("Cosine of (Pi, 0)", (new Complex(Math.PI, 0)).cos().equals(new Complex(-1, 0)));
        assertTrue("Cosine of (2 * Pi, 0)", (new Complex(Math.PI * 2, 0)).cos().equals(new Complex(1, 0)));
    }

    @Test
    public void checkTan() {
        assertTrue("Tan of (0, 0)", (new Complex(0, 0)).tan().equals(new Complex(0, 0)));
    }

    @Test
    public void checkExp() {
        assertTrue("Exp of (0, 0)", (new Complex(0, 0)).exp().equals(new Complex(1, 0)));
        assertTrue("Exp of (1, 0)", (new Complex(1, 0)).exp().equals(new Complex(Math.exp(1), 0)));
    }
}
