package demo.parallel;

import junit.framework.TestCase;
import static org.junit.Assert.*;

public class Tests extends TestCase {
    private Complex number;

    public void setUp() throws Exception {
        super.setUp();
        number = new Complex(8.5, 10.7);

    }

    public void testSub() throws Exception {
        number.sub(new Complex(4.4, 7.6));
        assertEquals(4.1, number.getRe(), 0.0001);
        assertEquals(3.1, number.getIm(), 0.0001);
    }
}