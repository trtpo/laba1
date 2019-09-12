package demo.parallel;

import static org.junit.Assert.*;
import org.junit.Test;

public class ComplexTest {
    private Complex complexTest  = new Complex(1,2);

    @Test
    public void subtraction() {
        complexTest.subtraction(new Complex(1,-1));
        assertEquals("Error subtraction", 0,complexTest.getRe(), 0.001);
        assertEquals("Error subtraction", 3,complexTest.getIm(), 0.001);
    }

    @Test
    public void division() {
        complexTest.division(new Complex(1,-1));
        assertEquals("Error division", -0.5,complexTest.getRe(),0.001);
        assertEquals("Error division", 1.5,complexTest.getIm(),0.001);
    }
}