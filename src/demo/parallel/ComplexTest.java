package demo.parallel;

import junit.framework.TestCase;

public class ComplexTest extends TestCase {
    private Complex number;

    public void setUp() throws Exception {
        super.setUp();
        number = new Complex(2.2,3.3);
    }

    public void testMinus() throws Exception {
        Complex result = number.minus(new Complex(1.2,1.3));
        assertEquals(1,result.getReal(),0.1);
        assertEquals(2,result.getImaginary(),0.1);
    }

    public void testDivide() throws Exception {
        Complex result = number.divide(new Complex(2.2,3.3));
        assertEquals(1,result.getReal(),0.1);
    }

}