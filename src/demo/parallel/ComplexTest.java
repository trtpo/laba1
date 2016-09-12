package demo.parallel;


import junit.framework.TestCase;

/**
 * Created by FerrariHD on 9/12/2016.
 */
public class ComplexTest extends TestCase {

    private Complex testValue;

    public void setUp() throws Exception {
        super.setUp();
        testValue = new Complex(7.9, 5.99);
    }

    public void testMinus() throws Exception {
        testValue.minus(new Complex(3.4, 2.99));
        assertEquals(4.5, testValue.getRe(), 0.0001);
        assertEquals(3, testValue.getIm(), 0.0001);
    }

}