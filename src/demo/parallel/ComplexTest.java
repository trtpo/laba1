package demo.parallel;

import static org.junit.Assert.*;

import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;
import org.junit.Test;

public class ComplexTest {
    Complex initial = new Complex(5, 7);
    Complex modifying = new Complex(1, 3);

    @Test
    public void TestingPlus() {
        Complex expectedResult = new Complex(6, 10);

        Complex result = initial.plus(modifying);
        Testing(expectedResult, result);
    }

    @Test
    public void TestingMinus() {
        Complex expectedResult = new Complex(4, 4);

        Complex result = initial.minus(modifying);
        Testing(expectedResult, result);
    }

    @Test
    public void TestingTimes() {
        Complex expectedResult = new Complex(-16, 22);

        Complex result = initial.times(modifying);
        Testing(expectedResult, result);
    }

    @Test
    public void TestingDivision() {
        Complex expectedResult = new Complex(2.6, -0.8);
        Complex result = initial.division(modifying);
        Testing(expectedResult, result);
    }

    public void Testing(Complex expectedResult, Complex result) {
        assertEquals(expectedResult.re, result.re, 0);
        assertEquals(expectedResult.im, result.im, 0);
    }
}
