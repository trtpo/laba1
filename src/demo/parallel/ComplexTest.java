package demo.parallel;

import org.junit.jupiter.api.Assertions;

public class ComplexTest {
    @org.junit.jupiter.api.Test
    void minus() {
        Complex number1 = new Complex(2, 3);
        Complex number2 = new Complex(1, 4);
        Complex res = number1.minus(number2);
        Assertions.assertEquals(res.getRe(), 1);
        Assertions.assertEquals(res.getIm() , -1);

    }
}
