package demo.parallel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UnitTest {

    private Complex a;
    private Complex b;

    @BeforeEach
    void createComplex() {
        a = new Complex(20.8, 5.7);
        b = new Complex(35.83, 25.53);
    }

    @Test
    void result_Of_Complex_Numbers_Subtraction() {
        Complex result = a.minus(b);

        Assertions.assertEquals(20.8 - 35.83, result.getRe(), 0.00001);
        Assertions.assertEquals(5.7 - 25.53, result.getIm(), 0.00001);
    }

    @Test
    void result_Of_Complex_Numbers_Division() {

        Complex result = a.div(b);
        Assertions.assertNotEquals((19.4 * 35.83 + 5.7 * 25.53) / (Math.sqrt(35.83) + Math.sqrt(25.53)), result.getRe(), 0.00001);
        Assertions.assertNotEquals((5.7 * 35.83 - 20.8 * 25.53) / (Math.sqrt(35.83) + Math.sqrt(25.53)), result.getIm(), 0.00001);
    }
}