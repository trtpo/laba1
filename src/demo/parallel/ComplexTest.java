package demo.parallel;

import org.junit.Test;

public class ComplexTest {

    Complex value_one = new Complex(1, 1);
    Complex value_two = new Complex(2, 2);
    double epsilon = 0.0001;

    public void compareResults(Complex actual, Complex expected){
        org.junit.Assert.assertEquals(actual.getRe(), expected.getRe(), epsilon);
        org.junit.Assert.assertEquals(actual.getIm(), expected.getIm(), epsilon);
    }

    @Test
    public void plus() {
        Complex expectedResult = new Complex(3, 3);
        Complex actualValue = value_two.plus(value_one);
        compareResults(actualValue, expectedResult);
    }

    @Test
    public void minus() {
        Complex expectedResult = new Complex(1, 1);
        Complex actualValue = value_two.minus(value_one);
        compareResults(actualValue, expectedResult);
    }

    @Test
    public void times(){
        Complex expectedResult = new Complex(0,4);
        Complex actualValue = value_one.times(value_two);
        compareResults(actualValue, expectedResult);
    }
}