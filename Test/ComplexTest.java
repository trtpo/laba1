package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    private Complex num1;
    private Complex num2;

    @Before
    public void setUp() throws Exception {
        num1 = new Complex(1, -1);
        num2 = new Complex(2, -4);
    }

    @Test
    public void div() throws Exception {
        Complex b = num1.div(num2);
        assertEquals("Divide num1 by num2 failed in the method 'div' of Complex.java. Failed b.getRealPart().", b.getRealPart(), 0.3, 0);
        assertEquals("Divide num1 by num2 failed in the method 'div' of Complex.java. Failed b.getImPart().", b.getImPart(), 0.1, 0);
    }

    @Test
    public void sub() throws Exception {
        Complex b = num1.minus(num2);
        assertEquals("Minus operation (num1-num2) failed in the method 'minus' of Complex.java. Failed b.getRealPart().", b.getRealPart(), -1, 0);
        assertEquals("Minus operation (num1-num2) failed in the method 'minus' of Complex.java. Failed b.getImPart().", b.getImPart(), 3, 0);
    }
}