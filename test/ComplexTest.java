import demo.parallel.Complex;

import static org.junit.Assert.*;

public class ComplexTest {

    Complex com;
    Complex arg;
    Complex result;

    @org.junit.Before
    public void setUp() throws Exception {
        com = new Complex(13, 1);
        arg = new Complex(7, -6);
    }

    @org.junit.Test
    public void subtraction() {
        result = new Complex(6, 7);
        assertEquals(result, com.subtraction(arg));
    }

    @org.junit.Test
    public void division() {
        result = new Complex(1, 1);
        assertEquals(result, com.division(arg));
    }

    @org.junit.Test
    public void invert() {
        result = new Complex(13, -1);
        assertEquals(result, com.invert(com));
    }

    @org.junit.Test
    public void len() {
        assertEquals(85, arg.len(arg.getRe(), arg.getIm()), 0);
    }
}