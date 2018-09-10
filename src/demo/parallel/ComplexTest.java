package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    Complex a = new Complex(5, 4);
    Complex b = new Complex(7, 10);
    @Test
    public void testMinus() throws Exception {
        a.minus(b);
        assertEquals(a.getReal(), -2, 0);
        assertEquals(a.getImagine(), -6, 0);
    }
    @Test
    public void testDivision() throws Exception {
        a.division(b);
        assertEquals(a.getReal(), 0, 5);
        assertEquals(a.getImagine(), 0, 1);
    }
}