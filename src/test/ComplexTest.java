package test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class ComplexTest {
        private Complex a;
        private Complex b;


        @Test
        void subtraction_test(){

            a = new Complex(18.6, 2);
            b = new Complex(57, 3);

            a.subtract(b);
            Assertions.assertEquals(18.6-57,a.getRe(),0.0001);
            Assertions.assertEquals(2-3,a.getIm(),0.0001);
        }

        @Test
        void division_test() {

            a = new Complex(18.6, 2);
            b = new Complex(57, 3);

            a.division(b);

            Assertions.assertEquals((double)1777 / 5430, a.getRe(), 0.00001);
            Assertions.assertEquals((double) 97 / 5430, a.getIm(), 0.00001);
        }
}

