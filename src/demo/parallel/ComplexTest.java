package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    Complex firstNumber = new Complex(1, 1);
    Complex secondNumber = new Complex(2, 2);

    @Test
    public void minus() {
        Complex expectedResult = new Complex(-1,-1);
        Complex actualResult = firstNumber.minus(secondNumber);
        complexTesting(expectedResult,actualResult);
    }

    @Test
    public void divide() {
        Complex expectedResult = new Complex(0.5,0);
        Complex actualResult = firstNumber.divide(secondNumber);
        complexTesting(expectedResult,actualResult);
    }

    public void complexTesting(Complex expectedResult, Complex actualResult){
        assertEquals(expectedResult.getReal(),actualResult.getReal(),0);
        assertEquals(expectedResult.getImag(),actualResult.getImag(),0);
    }
}