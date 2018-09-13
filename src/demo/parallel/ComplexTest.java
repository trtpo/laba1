package demo.parallel;

import static org.junit.Assert.*;

public class ComplexTest {

    @org.junit.Test
    public void min() {
        Complex z = new Complex(10,20);
        z.min(new Complex(5,10));
        assertEquals(z.getRe(),5,0);
        assertEquals(z.getIm(),10,0);
    }
}