package test;

import demo.parallel.Complex;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class ComplexTest {
    private Complex a, b;


    @Before
    public void init() throws Exception {
        a = new Complex(1, 2);
        b = new Complex(10, -12);
    }


    @Test
    public void subtractTest() throws Exception {
        a.minus(b);
        try {
            assertTrue(a.getRe() == -9 && a.getIm() == 14);
        } catch (junit.framework.AssertionFailedError ex) {
            System.out.println("Exception in \"subtractTest\" method. The parameters aren't equal. The number of line exception: " + ex.getStackTrace()[4].getLineNumber());
        }

    }


    @Test
    public void divide() throws Exception {
        a.div(b);
        try {
            assertTrue(a.getRe() == -0.05737704918032787 && a.getIm() == 0.13114754098360656);
        } catch (junit.framework.AssertionFailedError ex) {
            System.out.println("Exception in \"divideTest\" method. The parameters aren't equal. The number of line exception: " + ex.getStackTrace()[4].getLineNumber());
        }
    }



}