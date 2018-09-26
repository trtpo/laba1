package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void minus() throws Exception {
        Complex a = new Complex(12, 15);
        Complex b = new Complex(16, 18);
        Complex check = new Complex( -4, -3);
        System.out.println("minus test...");
        assertEquals(a.minus(b),check);
        System.out.println("minus test complete!");
    }

    @Test
    public void div() throws Exception {
        Complex a = new Complex(16, 18);
        Complex b = new Complex(2, 6);
        Complex check = new Complex(3.5, -1.5);
        System.out.println("div test...");
        assertEquals(check,a.div(b));
        System.out.println("div test complete!");
    }
}