package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    private Complex a, b;
    @Before
    public void setUp() throws Exception {
        a = new Complex(23, -4);
        b = new Complex(-7, 12);
    }
    @Test
    public void divide() throws Exception {
        a.divide(b);
        assertTrue("Error in divide method,",  a.getReal() == -1.0829015544041452 );
        assertTrue("Error in divide method,",  a.getImage() == -1.2849740932642486 );
    }

    @Test
    public void minus() throws Exception {
        a.minus(b);
        assertTrue("Error in minus method, ",  a.getReal() == 30 );
        assertTrue("Error in minus method, ",  a.getImage() == -16 );
    }

}