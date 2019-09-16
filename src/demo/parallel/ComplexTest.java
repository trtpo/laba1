package demo.parallel;

import junit.framework.TestCase;
import static org.junit.Assert.*;
/**
 * Created by kutko on 12.09.2016.
 */
public class ComplexTest extends TestCase {
    private Complex testValue;

    public void setUp() throws Exception {
        super.setUp();
        testValue = new Complex(4.8, 15.16);

    }

    public void testMinus() throws Exception {
        testValue.minus(new Complex(2.3, 4.2));
        assertEquals(2.5, testValue.getRe(), 0.0001);
        assertEquals(10.96, testValue.getIm(), 0.0001);
    }

    public void testTangent() throws Exception {
        testValue = testValue.Tangent(testValue);
        assertEquals(-21837476.51159335, testValue.getRe(), 0.0001);
        assertEquals(1918113.712, testValue.getIm(), 0.0001);

    }

}