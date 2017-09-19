package Tests;

import demo.parallel.Complex;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

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
        assertTrue("Error in divide method, real part, input data : a(23, -4) - b (-7, 12) ",  a.getReal() == -1.0829015544041452 );
        assertTrue("Error in divide method, image part, input data : a(23, -4) - b (-7, 12)  ",  a.getImage() == -1.2849740932642486 );
    }

    @Test
    public void minus() throws Exception {
        a.minus(b);
        assertTrue("Error in minus method, real part, input data : a(23, -4) - b (-7, 12) ",  a.getReal() == 30 );
        assertTrue("Error in minus method, image part, input data : a(23, -4) - b (-7, 12) ",  a.getImage() == -16 );
    }

}