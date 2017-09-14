package demo.parallel;

import junit.framework.TestCase;

/**
 * Created by mac on 9/14/17.
 */
public class ComplexTest extends TestCase {
    private Complex c;
    private Complex d;

    public void setUp() throws Exception {
        c = new Complex(-12, 13);
        d = new Complex(23, 245);
    }


    public void testMinus() throws Exception {
        Complex res = c.minus(d);
        assertEquals("minus opertaion test", -35.0, res.getRe(), 0.01);
        assertEquals("minus opertaion test", -232.0, res.getIm(), 0.01);
        }

}