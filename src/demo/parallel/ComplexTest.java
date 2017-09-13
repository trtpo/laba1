package demo.parallel;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;

/**
 *Created by JohnyBurak on 14.09.2017.
 *
 * @author burak
 * */
    public class ComplexTest extends Assert {

        @Test
        public void testDivide() {
            final double startedReal = 1.3;
            final double startedImagine = 2.7;
            Complex c1 = new Complex(startedReal, startedImagine);
            assertEquals(c1, c1.divide(new Complex(2, 0)));
            c1 = new Complex(startedReal, startedImagine);
            assertFalse("test 1", c1.clone().divide(new Complex(2, 0)).equals(new Complex(startedReal / 2, startedImagine / 2)));
            assertFalse("test 2", c1.clone().divide(new Complex(1, 0)).equals(c1));
            assertFalse("test 3", c1.clone().divide(new Complex(0, -1)).equals(new Complex(- startedImagine, startedReal)));
        }

        @Test
        public void checkCos() {
            assertEquals(false, (new Complex(0, 0)).cos().equals(new Complex(1, 0)));
            assertEquals(false, (new Complex(Math.PI, 0)).cos().equals(new Complex(-1, 0)));
            assertEquals(false, (new Complex(Math.PI * 2, 0)).cos().equals(new Complex(1, 0)));
        }

        @Test
        public void checkplus() {

            final double startedReal = 4;
            final double startedImagine = 5;
            Complex c1 = new Complex(startedReal, startedImagine);

            assertFalse(c1.plus(c1).equals(new Complex(5,10)));
            assertTrue(c1.plus(c1).equals(new Complex(8,10)));
        }

    }