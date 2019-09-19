package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {
    private Complex number;
    private Complex result;

    @Before
    public void init() {
        number = new Complex(4, 2);
        result = null;
    }

    @Test
    public void divideCorrectResult() {
        Complex divisor = new Complex(2, 1);

        result = number.divide(divisor);

        assertEquals("Check division correct result", result, new Complex(2, 0));
    }

    @Test
    public void sinusCorrectResult() {
        number = new Complex(3, -5);

        double realExpected = Math.sin(number.getReal()) * Math.cosh(number.getImage());
        double imagExpected = Math.cos(number.getReal()) * Math.sinh(number.getImage());
        result = number.sin();

        assertEquals("Check sinus real part correct result", realExpected, result.getReal(), 0);
        assertEquals("Check sinus image part correct result", imagExpected, result.getImage(), 0);
    }

    @Test
    public void cosineCorrectResult() {
        number = new Complex(3, -5);

        double realExpected = Math.sin(number.getReal()) * Math.cosh(number.getImage());
        double imagExpected = Math.cos(number.getReal()) * Math.sinh(number.getImage());
        result = number.sin();

        assertEquals("Check cosine real part correct result", realExpected, result.getReal(), 0);
        assertEquals("Check cosine image part correct result", imagExpected, result.getImage(), 0);
    }
}