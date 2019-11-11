package demo.parallel;

import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class ComplexTest {

    private static Complex five, six, seven;

    @BeforeClass
    public static void initNumbers() {
        five = new Complex(5,5);
        six = new Complex(6,6);
        seven = new Complex(7,7);
    }

    @org.junit.Test
    public void minus() {
        assertEquals("(6, 6) - (5, 5)", six.minus(five), new Complex(1,1));
        assertEquals("(6, 6) - (7, 7)", six.minus(seven), new Complex(-1,-1));
        assertEquals("(6, 6) - (-5, -5)", six.minus(five.neg()), new Complex(11,11));
    }

    @org.junit.Test
    public void neg() throws Exception {
        assertEquals("1", new Complex(-6,-6), six.neg());
        assertEquals("2", six, six.neg().neg());
    }
}