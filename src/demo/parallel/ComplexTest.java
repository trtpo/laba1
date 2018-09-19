package demo.parallel;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ComplexTest extends Assert {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

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
    public void checkExp() {
        assertTrue("Exp of (0, 0)", (new Complex(0, 0)).exp().equals(new Complex(1, 0)));
        assertTrue("Exp of (1, 0)", (new Complex(1, 0)).exp().equals(new Complex(Math.exp(1), 0)));
    }
}