package demo.parallel;
import static org.junit.Assert.*;

public class Test {
    @org.junit.Test
    public void sin() throws Exception {
        for (double re = -10, im = -10; re <= 10; re += 0.1, im += 0.5) {
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
    public void sub() throws Exception {
        for (double re1 = -10, im1 = -10; re1 < 10; re1 += 0.1, im1 += 0.2) {
            for (double re2 = -10, im2 = -10; re2 < 10; re2 += 0.3, im2 -= 0.4) {
                Complex num1 = new Complex(re1, im1);
                Complex num2 = new Complex(re2, im2);
                num1.sub(num2);
                Complex result = new Complex(re1 - re2, im1 - im2);
                assertTrue(num1.equals(result));
            }
        }
    }
}