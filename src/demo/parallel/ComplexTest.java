package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {

    @Test
    public void ComplexMinusEqualsZeroTest() throws Exception{
        Complex firstVariable = new Complex(3.8, 7.2);
        Complex secondVariable = new Complex( 3.8, 7.2);
        Complex actualResult = firstVariable.minus(secondVariable);

        Complex expectedResult = new Complex(0.0,0.0);

        double delta = 0.001;

        assertEquals(actualResult.getRe(), expectedResult.getRe(), delta);
        assertEquals(actualResult.getIm(), expectedResult.getIm(), delta);
    }

    @Test
    public void ComplexMinusPositiveReImTest() throws Exception{
        Complex firstVariable = new Complex(4.976, 9.937);
        Complex secondVariable = new Complex( 6.119, -11.248);
        Complex actualResult = firstVariable.minus(secondVariable);

        Complex expectedResult = new Complex(-1.143,21.185);

        double delta = 0.001;

        assertEquals(actualResult.getRe(), expectedResult.getRe(), delta);
        assertEquals(actualResult.getIm(), expectedResult.getIm(), delta);
    }

    @Test
    public void ComplexMinusNegativeReImTest() throws Exception{
        Complex firstVariable = new Complex(-17.483, -34.821);
        Complex secondVariable = new Complex( -19.849, 19.894);
        Complex actualResult = firstVariable.minus(secondVariable);

        Complex expectedResult = new Complex(2.366,-54.715);

        double delta = 0.001;

        assertEquals(actualResult.getRe(), expectedResult.getRe(), delta);
        assertEquals(actualResult.getIm(), expectedResult.getIm(), delta);
    }

    @Test
    public void ComplexMinusPositiveNegativeReImTest() throws Exception{
        Complex firstVariable = new Complex(22.792, -27.484);
        Complex secondVariable = new Complex( -14.914, -22.373);
        Complex actualResult = firstVariable.minus(secondVariable);

        Complex expectedResult = new Complex(37.706,-5.111);

        double delta = 0.001;

        assertEquals(actualResult.getRe(), expectedResult.getRe(), delta);
        assertEquals(actualResult.getIm(), expectedResult.getIm(), delta);
    }

    @Test
    public void ComplexMinusNegativePositiveReImTest() throws Exception{
        Complex firstVariable = new Complex(-39.293, 42.247);
        Complex secondVariable = new Complex( 59.305, 25.962);
        Complex actualResult = firstVariable.minus(secondVariable);

        Complex expectedResult = new Complex(-98.598,16.285);

        double delta = 0.001;

        assertEquals(actualResult.getRe(), expectedResult.getRe(), delta);
        assertEquals(actualResult.getIm(), expectedResult.getIm(), delta);
    }
}
