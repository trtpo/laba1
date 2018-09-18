package test;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void subtraction() {
        String message = new String("Subtraction failed:");
        Complex a = new Complex(0,0);
        Complex b = new Complex(-3,2);
        Complex result = a.subtraction(b);
        Complex expectedResult = new Complex(3,-2);
        if (result.getRe() != expectedResult.getRe()){
            message += " Real parts are not equals.";
        }
        if (result.getIm() != expectedResult.getIm()){
            message += " Imaginary parts are not equals.";
        }
        Assert.assertEquals(message, result, expectedResult);
    }

    @Test
    public void division() {
        String message = new String("Division failed:");
        Complex a = new Complex(13, 5);
        Complex b = new Complex(-3, 1);
        Complex result = a.division(b);
        Complex expectedResult = new Complex(-3.4,-2.8);
        if (result.getRe() != expectedResult.getRe()){
            message += " Real parts are not equals.";
        }
        if (result.getIm() != expectedResult.getIm()){
            message += " Imaginary parts are not equals.";
        }
        Assert.assertEquals(message , result, expectedResult);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionOnZero() {
        Complex a = new Complex(13, 5);
        Complex b = new Complex(0, 0);
        a.division(b);
    }
}
