package demo.parallel;
import static org.junit.Assert.*;

public class Test {

    @org.junit.Test
    public void sin() throws Exception {
        double re = -10, im = -10;
        Complex result = new Complex(Math.sin(re) * Math.cosh(im), Math.cos(re) * Math.sinh(im));
        Complex num = (new Complex(re, im)).sin();
        assertTrue(num.equals(result));

        re = 10;
        im = -10;
        Complex result1 = new Complex(Math.sin(re) * Math.cosh(im), Math.cos(re) * Math.sinh(im));
        Complex num1 = (new Complex(re, im)).sin();
        assertTrue(num.equals(result));

        re = -10;
        im = 10;
        Complex result2 = new Complex(Math.sin(re) * Math.cosh(im), Math.cos(re) * Math.sinh(im));
        Complex num2 = (new Complex(re, im)).sin();
        assertTrue(num.equals(result));

    }

    @org.junit.Test
    public void div() throws Exception {
        Complex num = new Complex(4, 8);
        assertTrue(new Complex(4, 8).equals(num.div(new Complex(0, 0))));
    }
}
