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
    final String realPartErrorMes = "Expected and result value of real part not equal.";
    final String imagePartErrorMes = "Expected and result value of image part not equal.";

    @Before
    public void setUp() throws Exception {
        z1 = new Complex(3,1);
        z2 = new Complex(5,-1);
    }

    @Test
    public void testDivision() throws Exception {
        Complex z = z1.div(z2);
        final String errorMessage= "Error of division operation!";
        assertEquals( errorMessage+realPartErrorMes,0.5384615384615384, z.getReal(), 0.0);
        assertEquals( errorMessage+imagePartErrorMes, 0.3076923076923077, z.getImag(), 0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() throws Exception {
        Complex zero = new Complex(0,0);
        z1.div(zero);
    }

    @Test
    public void testMinus() throws Exception {
        Complex z = z1.minus(z2);
        final String errorMessage= "Error of subtraction operation!";
        assertEquals( errorMessage+realPartErrorMes,-2, z.getReal(), 0.0);
        assertEquals( errorMessage+imagePartErrorMes, 2, z.getImag(), 0.0);
    }
}