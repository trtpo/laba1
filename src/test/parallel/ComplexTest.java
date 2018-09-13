package parallel;

import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ComplexTest {

    @Test
    public void division() {
        Complex c = new Complex(100,25);
        Complex b = new Complex(10,5);

        assertEquals(Complex.toString(c.division(b)), Complex.toString(new Complex(9,-2)));
    }

    @Test
    public void asterix() {
        Complex c = new Complex(100,25);
        Complex b = new Complex(10,5);

        assertEquals(Complex.toString(c.asterix(b)), Complex.toString(new Complex(8.75,-2.5)));
    }
}