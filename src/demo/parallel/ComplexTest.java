package demo.parallel;

import org.junit.Assert;

import static org.junit.Assert.*;

public class ComplexTest {

    @org.junit.Test
    public void complexNumberMinusOperationTest() throws Exception {
        Complex firstNumber = new Complex(5,-6);
        Complex secondNumber = new Complex(-3,2);
        Complex result = firstNumber.minus(secondNumber);
        Assert.assertEquals(8.0, result.getRealPart(),0);
        Assert.assertEquals(-8.0, result.getImaginaryPart(),0);
    }

    @org.junit.Test
    public void complexNumberDivisionTest() throws Exception {
        Complex firstNumber = new Complex(2,-1);
        Complex secondNumber = new Complex(1,1);
        Complex result = firstNumber.divTimes(secondNumber);
        Assert.assertEquals(0.5, result.getRealPart(),0);
        Assert.assertEquals(-1.5, result.getImaginaryPart(),0);
    }

    @org.junit.Test
    public void multiplicationComplexByRealNumberTest() throws Exception {
        Complex firstNumber = new Complex(2,-1);
        Complex result = firstNumber.multiply(2);
        Assert.assertEquals(4, result.getRealPart(),0);
        Assert.assertEquals(-2, result.getImaginaryPart(),0);
    }

    @org.junit.Test
    public void divisionComplexByRealNumberTest() throws Exception {
        Complex firstNumber = new Complex(4,-1);
        Complex result = firstNumber.division(2);
        Assert.assertEquals(2, result.getRealPart(),0);
        Assert.assertEquals(-0.5, result.getImaginaryPart(),0);
    }

}