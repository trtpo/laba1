package tests;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class ComplexOperationsTest {
    @Test
    public void subtractionTest() {
        Complex a = new Complex(0, 0 );
        Complex b = new Complex(0, 0 );
        a = a.minus(b);
        assertEquals("Zero complex numbers is not zero after sub.", a, new Complex(0, 0));

        a = new Complex(30000, 31000);
        b = new Complex(20000, 29000);
        a = a.minus(b);
        assertEquals("Random complex numbers is not correct after sub.", a, new Complex(10000, 2000));
    }

    @Test
    public void divisionTest() {
        Complex a = new Complex(0.0, 0.0);
        Complex b = new Complex(0.0, 0.0);
        a = a.div(b);
        assertTrue("Zero complex numbers is not NaN after div.", Double.isNaN(a.getReal()));
        assertTrue("Zero complex numbers is not NaN after div.", Double.isNaN(a.getImg()));

        a = new Complex(0.0, 1223);
        b = new Complex(0.0, 4567);
        a = a.div(b);
        assertEquals("Random complex numbers is not correct after div.", a, new Complex(0.267790672213707, 0));

    }

}
