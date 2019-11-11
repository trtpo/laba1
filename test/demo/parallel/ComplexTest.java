package demo.parallel;

import static org.junit.Assert.*;

public class ComplexTest {

    @org.junit.Test
    public void minus() {
        assertEquals(new Complex(5,5), (new Complex(6,6)).minus(new Complex(1,1)));
        assertEquals(new Complex(7,7), (new Complex(6,6)).minus(new Complex(-1,-1)));
        assertEquals(new Complex(6,6), (new Complex(6,6)).minus(new Complex(0,0)));
    }

    @org.junit.Test
    public void neg() throws Exception {
        assertEquals(new Complex(-6,-6), (new Complex(6,6)).neg());
        assertEquals(new Complex(6,6), (new Complex(-6,-6)).neg());
    }
}