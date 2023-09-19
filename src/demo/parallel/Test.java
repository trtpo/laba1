package demo.parallel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;


    class ComplexTest {

        @org.junit.jupiter.api.Test
        public void testMinus() {

            Complex a = new Complex(3, 5);
            Complex b = new Complex(1, 2);

            Complex result = a.minus(b);

            assertEquals(2, result.getRe());
            assertEquals(7, result.getIm());

        }

        @org.junit.jupiter.api.Test
        public void testDiv() {
            Complex a = new Complex(3, 5);
            Complex b = new Complex(1, 2);

            Complex result = a.div(b);

            assertEquals(0.5, result.getRe());
            assertEquals(6.5, result.getIm());

        }

    }

