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
        assertTrue("Error in divid method, 97  string in Complex file",  a.getReal() == -1.0829015544041452 );
        assertTrue("Error in divid method, 98  string in Complex file",  a.getImage() == -1.2849740932642486 );
    }

    @Test
    public void minus() throws Exception {
        a.minus(b);
        assertTrue("Error in minus method, 110  string in Complex file",  a.getReal() == 30 );
        assertTrue("Error in minus method, 111  string in Complex file",  a.getImage() == -16 );
    }

}