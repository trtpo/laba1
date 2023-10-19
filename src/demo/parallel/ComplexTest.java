package demo.parallel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComplexTest {
    private Complex a;
    private Complex b;

    @BeforeEach
    void createComlex() {
        a = new Complex(20.6, 3);
        b = new Complex(55, 4);
    }

    @Test
    void subTest(){
        Complex result = a.sub(b);

        Assertions.assertEquals(20.6 - 55, a.getRe(), 0.00001);
        Assertions.assertEquals(3 - 4, a.getIm(), 0.00001);
    }

    @Test
    void divTest() {

        Complex result = a.div(b);

        Assertions.assertEquals((double) 1121 / 3041, a.getRe(), 0.01);
        Assertions.assertEquals((double) 94 / 3041, a.getIm(), 0.01);
    }

}