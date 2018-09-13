package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {


    @Test
    public void testSubtraction() {
        String errorMessage = "Error in subtraction";

        Complex a = new Complex(5, 7);
        Complex b = new Complex(-9, 19);

        assertEquals(errorMessage, a.minus(b), new Complex(14, -12));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionOnZero() {
        new Complex(6, 1).div(new Complex(0, 0));
    }

    @Test
    public void testSimpleDivision() {
        String errorMessage = "Simple division error";

        Complex a = new Complex(-1, 3);
        Complex b = new Complex(1, 2);

        assertEquals(errorMessage, a.div(b), new Complex(1, 1));
    }
}
