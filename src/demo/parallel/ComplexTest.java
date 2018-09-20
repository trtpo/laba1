package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void minus() {
        Complex a = new Complex(1,2);
        Complex b = new Complex(1, 2);
        assertEquals(new Complex(0, 0), a.minus(b));
    }

    @Test
    public void div() {
        Complex a = new Complex(1,2);
        Complex b = new Complex(1, 2);
        assertEquals(new Complex(1, 0), a.div(b));
    }
}