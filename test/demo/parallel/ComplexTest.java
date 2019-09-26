package demo.parallel;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


    public class ComplexTest {
        private Complex a,b;


        @Before
        public void set()
        {
            a=new Complex(1,3);
        }

        @Test
        public void testPlus() {
            b=new Complex(2,3);
            Complex result=a.plus(b);
            assertEquals(new Complex(3,6),result);
        }

        @Test
        public void testTimes() {
            a=new Complex(1,2);
            b=new Complex(2,4);
            Complex result=a.times(b);
            assertEquals(new Complex(-6,8),result);
        }

        @Test
        public void testDiv() {
            a=new Complex(2,4);
            b=new Complex(1,2);
            Complex result=a.div(b);
           assertEquals(new Complex(2,0),result);
        }

        @Test
        public void testMinus() {
            b=new Complex(1,2);
            Complex result= a.minus(b);
            assertEquals(new Complex(0,1),result);
        }

        @Test
        public void testSin() {
            double real = Math.sin(a.getRe()) * Math.cosh(a.getIm());
            double imag = Math.cos(a.getRe()) * Math.sinh(a.getIm());
            Complex result = a.sin();
           assertEquals(real, result.getRe(), 0);
           assertEquals(imag, result.getIm(), 0);
        }

        @Test
        public void testCos() {
            double real = Math.cos(a.getRe()) * Math.cosh(a.getIm());
            double imag = -Math.sin(a.getRe()) * Math.sinh(a.getIm());
            Complex result = a.cos();
            assertEquals(real, result.getRe(), 0);
            assertEquals(imag, result.getIm(), 0);
        }

        @Test (expected = ArithmeticException.class)
        public void testDivisionByZero()
        {
            a=new Complex(1,2);
            b=new Complex(0,0);
            Complex result=a.div(b);
            Assert.fail();
        }
    }
