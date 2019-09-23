package demo.parallel;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    private Complex value;
    private Complex negativeValue;
    private Complex result;

    @Before
    public void setup() {
        value = new Complex(3, 5);
        negativeValue = new Complex(-3, -5);
        result = null;
    }

    @Test
    public void testMinus() {
        Complex num = new Complex(1, 3);
        result = value.minus(num);
        assertEquals(new Complex(2, 2), result);
    }

    @Test
    public void testMinusWithNegativeValue() {
        Complex num = new Complex(-4, 2);
        result = value.minus(num);
        assertEquals(new Complex(7, 3), result);

        result = negativeValue.minus(num);
        assertEquals(new Complex(1, -7), result);
    }

    @Test
    public void testSin() {
        double real = Math.sin(value.getRe()) * Math.cosh(value.getIm());
        double imag = Math.cos(value.getRe()) * Math.sinh(value.getIm());

        result = value.sin();

        assertEquals(real, result.getRe(), 0);
        assertEquals(imag, result.getIm(), 0);
    }
}