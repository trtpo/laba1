package demo.parallel;

import static org.junit.Assert.*;



public class Test {

    @org.junit.Test
    public void minus() throws Exception {
        for (double re1 = -10, im1 = -10; re1 < 10; re1 += 0.3534, im1 += 0.1) {
            for (double re2 = -10, im2 = -10; re2 < 10; re2 += 0.23, im2 -= 0.235) {
                Complex num1 = new Complex(re1, im1);
                Complex num2 = new Complex(re2, im2);
                num1 = num1.minus(num2);
                Complex result = new Complex(re1 - re2, im1 - im2);
                assertTrue(num1.equals(result));
            }
        }
    }
    
    @org.junit.Test
    public void neg() throws Exception {
        for (double re = -10, im = -10; re < 10; re += 0.3534, im += 0.1) {
            Complex num = new Complex(re, im);
            assertTrue(num.equals(num.neg()));
        }
    }
}