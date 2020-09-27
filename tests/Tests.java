import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    void testMinus() {
        Complex a = new Complex(15.2, 1.3);
        Complex b = new Complex(3.2, -5.0);

        Complex expectedResult = new Complex(12.0, 6.3);
        Complex result = a.minus(b);

        assertEquals(expectedResult.getReal(),result.getReal(),"Real parts of results are different.");
        assertEquals(expectedResult.getImaginary(),result.getImaginary(),"Imaginary parts of results are different.");
    }

    @Test
    void testDivide() {
        Complex a = new Complex(7.0, -8.0);
        Complex b = new Complex(6.0, 2.0);

        Complex expectedResult = new Complex(0.65, -1.55);
        Complex result = a.divide(b);

        assertEquals(expectedResult.getReal(),result.getReal(),"Real parts of results are different.");
        assertEquals(expectedResult.getImaginary(),result.getImaginary(),"Imaginary parts of results are different.");
    }

    @Test
    void testDivideByZero() {
        Complex a = new Complex(4.0, 18.0);
        Complex b = new Complex(0.0, 0.0);

        Complex expectedResult = new Complex(4.0, 18.0);
        Complex result = a.divide(b);

        assertEquals(expectedResult.getReal(),result.getReal(),"Real parts of results are different.");
        assertEquals(expectedResult.getImaginary(),result.getImaginary(),"Imaginary parts of results are different.");
    }
}