package demo.parallel;

import static org.junit.Assert.*;

/**
 * Created by Alla on 12.09.2016.
 */
public class TestB {
    @org.junit.Test
    public void times() throws Exception {
        Complex a = new Complex(3, 4);
        Complex b = new Complex(-2, 1);

        a = a.times(b);

        Complex expected = new Complex(-2, 1);

        assertEquals(expected.getReal(), b.getReal(), 0);
        assertEquals(expected.getImaginary(), b.getImaginary(), 0);

        System.out.println("TestB successfully run.\n");
    }

}