package demo.parallel;

import junit.framework.TestCase;

public class ComplexTest extends TestCase {
    private Complex testValue;

    public void setUp() throws Exception {
        super.setUp();
        testValue = new Complex(70.8, 5.1);

    }

    public void testMinus() throws Exception {
        testValue.minus(new Complex(20.2, 0.9));
        assertEquals(50.6, testValue.getRe(), 0.0001);
        assertEquals(4.2, testValue.getIm(), 0.0001);
    }

    void divide() {
        Complex operationResult = new Complex(20.2, -30).division(new Complex(2, 4));
        assertEquals(operationResult.getRe(), (20.2*2 + -30*4) / (2*2 + 4*4));
        assertEquals(operationResult.getIm(), (-30*2 - 20.2*4) / (2*2 + 4*4));

    }

}