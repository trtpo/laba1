package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    private Complex a;
    private Complex b;

    private final String errorMessageRealPart = "Expected and actual values real part are different";
    private final String errorMessageImaginaryPart = "Expected and actual values of imaginary part are different";
    private final double DELTA = 0.01;

    @Before
    public void initComplexNumbers(){
        a = new Complex(-1, 5);
        b = new Complex(2,3);
    }

    @Test
    public void divideValidComplexNumbers() {
        final Complex complex = a.divide(b);

        assertEquals(errorMessageImaginaryPart, complex.getImaginaryPart(), 1, DELTA);
        assertEquals(errorMessageRealPart, complex.getRealPart(), 1, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideOnZero(){
        a.divide(new Complex(0,0));
    }

    @Test
    public void plusValidComplexNumbers () {
        a.plus(b);

        assertEquals(errorMessageImaginaryPart, a.getImaginaryPart(), 8, DELTA);
        assertEquals(errorMessageRealPart, a.getRealPart(), 1, DELTA);
    }

    @Test
    public void minusValidComplexNumbers() {
        a.minus(b);

        assertEquals(errorMessageRealPart, a.getRealPart(), -3, DELTA);
        assertEquals(errorMessageImaginaryPart, a.getImaginaryPart(), 2, DELTA);
    }

    @Test
    public void sinusValidComplexNumbers() throws Exception {
        Complex expected = a.sinus();
        Complex actual = new Complex(-62.445,40.0921);

        assertEquals(errorMessageImaginaryPart, expected.getImaginaryPart(), actual.getImaginaryPart(), DELTA);
        assertEquals(errorMessageRealPart, expected.getRealPart(), actual.getRealPart(), DELTA);
    }


}