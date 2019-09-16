package demo.parallel;
import static org.junit.Assert.*;

public class Test {
    @org.junit.Test
    public void isDivWorks(){
        double re1=2, re2=10, im1=7, im2=0;
        Complex num1 = new Complex(re1, im1);
        Complex num2 = new Complex(re2, im2);
        num1.div(num2);
        Complex result = new Complex(0.2, 0.7);
        assertTrue(num1.equals(result));
    }
    @org.junit.Test
    public void isMinusWorks() {
        double re1=10, re2=-10, im1=10, im2=-10;
        Complex num1 = new Complex(re1, im1);
        Complex num2 = new Complex(re2, im2);
        num1.minus(num2);
        Complex result = new Complex(re1 - re2, im1 - im2);
        assertTrue(num1.equals(result));
    }

}
