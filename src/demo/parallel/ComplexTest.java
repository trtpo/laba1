package demo.parallel;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

class ComplexTest {

    public static final double THRESHOLD = 0.00001;

    @Test
    public void timesByValueTest() {
        Complex expectedResult = new Complex(6, 6);
        double num = 2;

        Complex value = new Complex(3, 3);

        Complex result = value.times(num);

        assertTrue(Double.compare(expectedResult.getIm(), result.getIm()) == 0
                && Double.compare(expectedResult.getRe(), result.getRe()) == 0);
    }

    @Test
    public void divideByNotZeroComplexNumberTest() {
        Complex expectedResult = new Complex(0.8, -0.4);

        Complex divider = new Complex(1, 3);
        Complex value = new Complex(2, 2);

        Complex result = value.divide(divider);

        assertTrue(Math.abs((result.getIm() - expectedResult.getIm()))  <= THRESHOLD
                && Math.abs(expectedResult.getRe()- result.getRe())  <= THRESHOLD);
    }

}