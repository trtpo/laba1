package demo.parallel;

import static org.junit.Assert.*;

/**
 * Created by Alla on 12.09.2016.
 */
public class TestC {
    @org.junit.Test
    public void minus() throws Exception {
        Complex a = new Complex(4, 4);
        Complex b = new Complex(8, 0);

        b = b.minus(a);

        Complex expected = new Complex(4, -4);

        assertEquals(expected.getReal(), b.getReal(), 0);
        assertEquals(expected.getImaginary(), b.getImaginary(), 0);

        System.out.println("TestC successfully run.\n");
    }

}