package demo.parallel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {

    @Test
    public void divisionByZeroTest() {
        Complex a = new Complex(67.5, 35.7);
        Complex zero = new Complex(0, 0);
        a.divide(zero);
        assertTrue(a.isNaN());
    }

    @Test
    public void divisionByRandomNumberTest() {
        Complex a = new Complex(5, 2);
        Complex b = new Complex(4, 8);
        Complex expectedResult = new Complex(0.45,-0.4);
        Complex result = a.divide(b);
        assertEquals(expectedResult.getReal(),result.getReal());
        assertEquals(expectedResult.getImaginary(),result.getImaginary());
    }

    @Test
    public void minusForRandomNumbers() {
        Complex a = new Complex(23.4, -56.3);
        Complex b = new Complex(0.4, -14.3);
        Complex expectedResult = new Complex(23,-42);
        Complex result = a.minus(b);
        assertEquals(expectedResult.getReal(), result.getReal());
        assertEquals(expectedResult.getImaginary(), result.getImaginary());
    }
}