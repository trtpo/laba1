package demo.parallel;

import org.junit.Assert;
import org.junit.Test;


public class ComplexTest extends Assert{

    @Test(expected = ArithmeticException.class)
    public void divisionTest() {
        Complex a = new Complex(5, 6);
        Complex b = new Complex(0, 0);
        a.divide(b);
        assertEquals("Illegal operation in method divide(Complex) of Complex file. Argument: Complex(0,0).", 0, a.getRe(), 0);
        assertEquals("Illegal operation in method divide(Complex) of Complex file. Argument: Complex(0,0).", 0, a.getIm(), 0);
    }

    @Test
    public void minusTest() {
        Complex a = new Complex(5, 0);
        Complex b = new Complex(1, 2);
        a.minus(b);
        assertEquals("Wrong real part in method minus() of Complex file. Object: Complex(5,0). Argument: Complex(1,2).", 4, a.getRe(), 0);
        assertEquals("Wrong imaginary part in method minus() of Complex file. Object: Complex(5,0). Argument: Complex(1,2).", -2, a.getIm(), 0);
    }

    @Test
    public void squareTest() {
        Complex a = new Complex(5, 3);
        a.square();
        assertEquals("Wrong real part in method square() of Complex file. Object: Complex(5,3).", 16, a.getRe(), 0);
        assertEquals("Wrong imaginary part in method square() of Complex file. Object: Complex(5,3).", 30, a.getIm(), 0);
    }

}