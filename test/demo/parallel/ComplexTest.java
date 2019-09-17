package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {

    private Complex value;
    private Complex negativeValue;
    private Complex answer;

    @Before
    public void setup() {
        value = new Complex(2, 4);
        negativeValue = new Complex(-2, -4);
        answer = null;
    }

    @Test
    public void testMinus() {
        Complex num = new Complex(1, 3);
        answer = value.minus(num);
        assertEquals(new Complex(1, 1), answer);
    }

    @Test
    public void testMinusPositiveValueWithNegativeSubtrahend() {
        Complex num = new Complex(-3, 5);
        answer = value.minus(num);
        assertEquals(new Complex(5, -1), answer);
    }

    @Test
    public void testMinusNegativeValueWithNegativeSubtrahend() {
        Complex num = new Complex(-3, 5);
        answer = negativeValue.minus(num);
        assertEquals(new Complex(1, -9), answer);
    }

    @Test
    public void testDivide() {
        Complex num = new Complex(1, 1);
        answer = value.divide(num);
        assertEquals(new Complex(3, 1), answer);
    }

    @Test
    public void testDivideWithNegativeDivider() {
        Complex num = new Complex(-1, 1);
        answer = value.divide(num);
        assertEquals(new Complex(1, -3), answer);
    }

    @Test
    public void testSin() {
        double real = Math.sin(value.getRe()) * Math.cosh(value.getIm());
        double imag = Math.cos(value.getRe()) * Math.sinh(value.getIm());

        answer = value.sin();

        assertEquals(real, answer.getRe(), 0);
        assertEquals(imag, answer.getIm(), 0);
    }

    @Test
    public void testSinWithNegativeNumber() {
        double real = Math.sin(negativeValue.getRe()) * Math.cosh(negativeValue.getIm());
        double imag = Math.cos(negativeValue.getRe()) * Math.sinh(negativeValue.getIm());

        answer = negativeValue.sin();

        assertEquals(real, answer.getRe(), 0);
        assertEquals(imag, answer.getIm(), 0);
    }

    @Test
    public void testCos() {
        double real = Math.cos(value.getRe()) * Math.cosh(value.getIm());
        double imag = -Math.sin(value.getRe()) * Math.sinh(value.getIm());

        answer = value.cos();

        assertEquals(real, answer.getRe(), 0);
        assertEquals(imag, answer.getIm(), 0);
    }

    @Test
    public void testCosWithNegativeNumber() {
        double real = Math.cos(negativeValue.getRe()) * Math.cosh(negativeValue.getIm());
        double imag = -Math.sin(negativeValue.getRe()) * Math.sinh(negativeValue.getIm());

        answer = negativeValue.cos();

        assertEquals(real, answer.getRe(), 0);
        assertEquals(imag, answer.getIm(), 0);
    }
}
