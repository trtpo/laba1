package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import demo.parallel.Complex;
import static org.junit.Assert.*;
class ComplexTest {

	@Test
	  public void sin() {
        Complex number = new Complex(2, 0);
        double realExpected = Math.sin(number.getRe()) * Math.cosh(number.getIm());
        double imagExpected = Math.cos(number.getRe()) * Math.sinh(number.getIm());
        Complex result = number.sin();

        assertEquals("Check sinus real part correct result", realExpected, result.getRe(), 0);
        assertEquals("Check sinus image part correct result", imagExpected, result.getIm(), 0);
    }

    @Test
    public void cos() {
        Complex number = new Complex(2, 0);
        double realExpected = Math.cos(number.getRe()) * Math.cosh(number.getIm());
        double imagExpected = -Math.sin(number.getRe()) * Math.sinh(number.getIm());
        Complex result = number.cos();

        assertEquals("Check cosine real part correct result", realExpected, result.getRe(), 0);
        assertEquals("Check cosine image part correct result", imagExpected, result.getIm(), 0);
    }

}
