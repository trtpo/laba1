package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Antoha12018 on 12.09.2017.
 */
public class ComplexTest {

    private Complex z1;
    private Complex z2;

    @Before
    public void setUp() throws Exception {
        z1 = new Complex(3,1);
        z2 = new Complex(5,-1);
    }

    @Test
    public void calculateDivision() throws Exception {
        Complex z = z1.div(z2);
        assertEquals( "Real part of division",0.5384615384615384, z.getReal(), 0.0);
        assertEquals( "Image part of division", 0.3076923076923077, z.getImag(), 0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void calculateDivisionByZero() throws Exception {
        Complex zero = new Complex(0,0);
        z1.div(zero);
    }

    @Test
    public void calculateSubtraction() throws Exception {
        Complex z = z1.sub(z2);
        assertEquals( "Real part of subtracting",-2, z.getReal(), 0.0);
        assertEquals( "Image part of subtracting", 2, z.getImag(), 0.0);
    }
}