package demo.parallel;

import static org.junit.Assert.*;

public class ComplexTest {
    @org.junit.Test
    public void sin() throws Exception {
        for (double re = -10, im = -10; re <= 10; re += 0.2, im += 0.3) {
            Complex result = new Complex(Math.sin(re) * Math.cosh(im), Math.cos(re) * Math.sinh(im));
            Complex num = (new Complex(re, im)).sin();
            assertTrue(num.equals(result));
        }
        for (double re = 10, im = -10; im <= 10; re--, im++) {
            Complex result = new Complex(Math.sin(re) * Math.cosh(im), Math.cos(re) * Math.sinh(im));
            Complex num = (new Complex(re, im)).sin();
            assertTrue(num.equals(result));
        }
        for (double re = -10, im = 10; re <= 10; re++, im--) {
            Complex result = new Complex(Math.sin(re) * Math.cosh(im), Math.cos(re) * Math.sinh(im));
            Complex num = (new Complex(re, im)).sin();
            assertTrue(num.equals(result));
        }
    }
    @org.junit.Test
    public void cos() throws Exception {
        for (double re = -10, im = -10; re <= 10; re += 0.3, im += 0.4) {
            Complex result = new Complex(Math.cos(re) * Math.cosh(im), -Math.sin(re) * Math.sinh(im));
            Complex num = (new Complex(re, im)).cos();
            assertTrue(num.equals(result));
        }
        for (double re = 10, im = -10; im <= 10; re--, im += 0.2353433343) {
            Complex result = new Complex(Math.cos(re) * Math.cosh(im), -Math.sin(re) * Math.sinh(im));
            Complex num = (new Complex(re, im)).cos();
            assertTrue(num.equals(result));
        }
        for (double re = -10, im = 10; re <= 10; re += 0.534444334, im--) {
            Complex result = new Complex(Math.cos(re) * Math.cosh(im), -Math.sin(re) * Math.sinh(im));
            Complex num = (new Complex(re, im)).cos();
            assertTrue(num.equals(result));
        }
    }
    @org.junit.Test
    public void minus() throws Exception {
        for (double re1 = -10, im1 = -10; re1 < 10; re1 += 0.35343, im1 += 0.1) {
            for (double re2 = -10, im2 = -10; re2 < 10; re2 += 0.22, im2 -= 0.235) {
                Complex num1 = new Complex(re1, im1);
                Complex num2 = new Complex(re2, im2);
                num1.minus(num2);
                Complex result = new Complex(re1 - re2, im1 - im2);
                assertTrue(num1.equals(result));
            }
        }
    }
    @org.junit.Test
    public void equals() throws Exception {
        for (double re = -10, im = -10; re <= 10; re += 0.3, im += 0.4) {
            Complex result = new Complex(re,im);
            Complex num = (new Complex(re, im));
            assertTrue(num.equals(result));
        }
    }
}