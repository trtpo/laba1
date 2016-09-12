package demo.parallel;

import junit.framework.TestCase;

/**
 * Created by sgsdf on 9/12/2016.
 */
public class ComplexTest extends TestCase {

    private Complex testValue;

    public void setUp() throws Exception {
        super.setUp();
        testValue = new Complex(6.9, 13.37);
    }

    public void testMinus() throws Exception {
        testValue.minus(new Complex(1.9, 2.28));
        assertEquals(5.0, testValue.getRe(), 0.0001);
        assertEquals(11.09, testValue.getIm(), 0.0001);
    }

}