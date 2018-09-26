package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void minus() {
        Complex q = new Complex(10, 20);
        q.minus(new Complex(5, 10));
        assertEquals(q.getRe(),5,0);
        assertEquals(q.getIm(),10,0);
    }
}