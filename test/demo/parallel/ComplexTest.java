package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {

    private Complex number;
    private Complex result;

    @Before
    public void init() {
        number = new Complex(6,-3);
    }

    @Test
    public void sinCorrectResult() {
        double realExpected = Math.sin(number.getRe()) * Math.cosh(number.getIm());
        double imagExpected = Math.cos(number.getRe()) * Math.sinh(number.getIm());
        result = number.sin();

        assertEquals("Check sinus real part correct result", realExpected, result.getRe(), 0);
        assertEquals("Check sinus image part correct result", imagExpected, result.getIm(), 0);
    }

    @Test
    public void cosCorrectResult() {
        double realExpected = Math.cos(number.getRe()) * Math.cosh(number.getIm());
        double imagExpected = -Math.sin(number.getRe()) * Math.sinh(number.getIm());
        result = number.cos();

        assertEquals("Check cosine real part correct result", realExpected, result.getRe(), 0);
        assertEquals("Check cosine image part correct result", imagExpected, result.getIm(), 0);
    }

}
