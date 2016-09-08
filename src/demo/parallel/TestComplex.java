package demo.parallel;

import static org.junit.Assert.*;
import org.junit.Before;
/**
 * Created by admin on 08.09.2016.
 */
public class TestComplex {
    private Complex minTest;
    private Complex cosTest;

    @Before public void setUp() {
        minTest = new Complex(5, 7);
        cosTest = new Complex(1,2).cos();
    }
        @org.junit.Test
    public void cos() throws Exception {
            assertEquals(new Complex(1,2).cos().getRe(), cosTest.getRe(), 0.0001);
            assertEquals(new Complex(1,2).cos().getIm(), cosTest.getIm(), 0.0001);
        }

    @org.junit.Test
    public void min() throws Exception {
        minTest.min(new Complex(4,5));
        assertEquals(1,minTest.getRe(),0.0001);
        assertEquals(2,minTest.getIm(),0.0001);
    }

}