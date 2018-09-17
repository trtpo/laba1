package demo.parallel;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


    public class Testing {
        private Complex a;
        private Complex b;

        @Before
        public void setup() throws Exception {
            a = new Complex(5, 6);
            b = new Complex(3, 2);
        }

        @Test
        public void testingPlus() throws Exception {
            a.plus(b);
            assertEquals("Complex number after plus isn't correct", 8, a.getRe(), 0.001);
            assertEquals("Complex number after plus isn't correct", 8, a.getIm(), 0.001);
        }

        @Test
        public void testingTimes() throws Exception {
            a.times(b);
            assertEquals("Complex number after times isn't correct", 3, a.getRe(), 0.001);
            assertEquals("Complex number after times isn't correct", 28, a.getIm(), 0.001);
        }

        @Test
        public void testingMinus() throws Exception {
            a.minus(b);
            assertEquals("Complex number after minus isn't correct", 2, a.getRe(), 0.001);
            assertEquals("Complex number after minus isn't correct", 4, a.getIm(), 0.001);
        }

        @Test
        public void testingDivide() throws Exception {
            a.divide(b);
            assertEquals("Complex number after divide isn't correct", 2.076, a.getRe(), 0.001);
            assertEquals("Complex number after divide isn't correct", 0.615, a.getIm(), 0.001);
        }
    }

