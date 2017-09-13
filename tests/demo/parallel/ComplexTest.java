package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    @Test
    public void minus() throws Exception {
        Complex num1 = new Complex(3, 1);
        Complex num2 = new Complex(2, 4);
        assertTrue(new Complex(1,-3).equality(num1.minus(num2)));
    }

    @Test
    public void div() throws Exception {
        Complex num1 = new Complex(-2, 1);
        Complex num2 = new Complex(1, -1);
        assertTrue(new Complex(-1.5,-0.5).equality(num1.div(num2)));
    }

}