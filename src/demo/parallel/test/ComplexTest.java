package demo.parallel.test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
 class ComplexTest {
    private Complex a;
    private Complex b;

    @BeforeEach
    void createComplex() {
        a = new Complex(19.4, 3.7);
        b = new Complex(44.83, 55.16);
    }

    @Test
    void subtraction_resultOfComplexNumbersSubtraction() {
        Complex result = a.subtraction(b);

        Assertions.assertEquals(19.4 - 44.83, result.getRe(), 0.00001);
        Assertions.assertEquals(3.7 - 55.16, result.getIm(), 0.00001);
    }

    @Test
    void special_factOfDifferenceWithThePlusMethod() {

        Complex result = a.special(b);

        Assertions.assertNotEquals(19.4 + 44.83, result.getRe(), 0.00001);
        Assertions.assertNotEquals(3.7 + 55.16, result.getIm(), 0.00001);
    }
}
