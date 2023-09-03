package demo.text;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexOperationsTest
{
    @Test
    public void testMinusOperation()
    {
        Complex num1 = new Complex(-2, 1);
        Complex num2 = new Complex(3, 5);
        Complex result = num1.minus(num2);
        assertEquals(-5.0, result.getRe(), 0.001);
        assertEquals(-4.0, result.getIm(), 0.001);
    }

    @Test
    public void testDivideOperation()
    {
        Complex num1 = new Complex(2, 14);
        Complex num2 = new Complex(8, 4);
        Complex result = num1.divide(num2);
        assertEquals(0.9 , result.getRe(), 0.001);
        assertEquals(1.3, result.getIm(), 0.001);
    }

}
