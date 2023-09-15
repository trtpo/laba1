package demo.test;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexOperationsTest
{
    @Test
    public void testMinusOperation()
    {
        Complex num1 = new Complex(10, 7);
        Complex num2 = new Complex(3, 2);
        Complex result = num1.minus(num2);
        assertEquals(7.0, result.getRe(), 0.001);
        assertEquals(5.0, result.getIm(), 0.001);
    }

    @Test
    public void testDivideOperation()
    {
        Complex num1 = new Complex(12, 6);
        Complex num2 = new Complex(4, 2);
        Complex result = num1.divide(num2);
        assertEquals(3.0 , result.getRe(), 0.001);
        assertEquals(0.0, result.getIm(), 0.001);
    }

}