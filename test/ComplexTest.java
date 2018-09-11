import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void testSubtraction() {
        String errorMessage = "Error in subtraction two simple complex numbers";

        Complex a = new Complex(5, 7);
        Complex b = new Complex(-9, 19);

        assertEquals(errorMessage, a.subtract(b), new Complex(14, -12));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionOnZero() {
        new Complex(6, 1).divide(new Complex(0, 0));
    }

    @Test
    public void testSimpleDivision() {
        String errorMessage = "Simple division error";

        Complex a = new Complex(-1, 3);
        Complex b = new Complex(1, 2);

        assertEquals(errorMessage, a.divide(b), new Complex(1, 1));
    }

    @Test
    public void testPowerIn20() {
        String errorMessage = "Error while exponentiation in 20 power";

        Complex a = new Complex(3, Math.sqrt(3));

        double module = Math.pow(2 * Math.sqrt(3), 20);
        Complex answer = new Complex(module * Math.cos(4 * Math.PI / 3), module * Math.sin(4 * Math.PI / 3));
        a.pow(20);

        assertEquals(errorMessage, a.getRe(), answer.getRe(), 5);
        assertEquals(errorMessage, a.getIm(), answer.getIm(), 5);
    }

    @Test
    public void testPowerInZero() {
        String errorMessage = "Error while exponentiation in zero power";

        Complex a = new Complex(3, Math.sqrt(3));
        a.pow(0);

        assertEquals(errorMessage, a, new Complex(1, 0));
    }

    @Test
    public void testGetArgumentInSecondQuadrant() {
        String errorMessage = "Error while get argument num in second quadrant";

        Complex a = new Complex(-3, 2);

        assertEquals(errorMessage, a.getArgument(), (Math.PI + Math.atan(2.0d / -3.0d)), 0.0001);
    }

    @Test
    public void testGetArgumentIn90deg() {
        String errorMessage = "Error while get argument num in 90 deg";

        Complex a = new Complex(0, 5);

        assertEquals(errorMessage, a.getArgument(), Math.PI / 2, 0.0001);
    }

    @Test
    public void testGetModulus() {
        String errorMessage = "Count modulus error";

        Complex a = new Complex(4, -3);

        assertEquals(errorMessage, a.getModulus(), 5, 0.0001);
    }
}