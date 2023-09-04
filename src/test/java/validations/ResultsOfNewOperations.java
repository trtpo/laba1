package validations;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ResultsOfNewOperations {
    @Test
    public void testAddition() {
        Complex a = new Complex(2.0, 3.0);
        Complex b = new Complex(1.0, 2.0);
        Complex result = a.plus(b);
        assertEquals(new Complex(3.0, 5.0), result);
    }

    @Test
    public void testSubtraction() {
        Complex a = new Complex(5.0, 4.0);
        Complex b = new Complex(2.0, 1.0);
        Complex result = a.minus(b);
        assertEquals(new Complex(3.0, 3.0), result);
    }

    @Test
    public void testMultiplication() {
        Complex a = new Complex(2.0, 3.0);
        Complex b = new Complex(4.0, 5.0);
        Complex result = a.times(b);
        assertEquals(new Complex(-7.0, 22.0), result);
    }

    @Test
    public void testDivision() {
        Complex a = new Complex(6.0, 8.0);
        Complex b = new Complex(2.0, 1.0);
        Complex result = a.divide(b);
        assertEquals(new Complex(4.0, 2.0), result);
    }

}
