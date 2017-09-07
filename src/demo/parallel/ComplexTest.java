package demo.parallel;

import static org.junit.Assert.*;

/**
 * Created by alexey on 07.09.17.
 */
public class ComplexTest {

    @org.junit.Test
    public void minus_positive() throws Exception {
        Complex num = new Complex(23,18).minus(new Complex(20,2));
        assertTrue(new Complex(3,16).equals(num));
    }

    @org.junit.Test
    public void minus_negative() throws Exception {
        Complex num = new Complex(3,8).minus(new Complex(8,15));
        assertTrue(new Complex(-5,-7).equals(num));
    }

}