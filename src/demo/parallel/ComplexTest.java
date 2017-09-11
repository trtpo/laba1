package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    private Complex num1;
    private Complex num2;

    @Before
    public void setUp() throws Exception {
        num1 = new Complex(1,-1);
        num2 = new Complex(2,-4);
    }

    @Test
    public void div() throws Exception {
        assertTrue(new Complex(0.3,0.1).equals(num1.div(num2)));
    }

    @Test
    public void divByZero() throws Exception {
        Complex b = num1.div(new Complex(0,0));
        assertEquals("Division by zero is illegal operation", b.getRealPart(),0,0);
        assertEquals("Division by zero is illegal operation", b.getImPart(),0,0);
    }

    @Test
    public void sub() throws Exception {
        assertTrue(new Complex(-1,3).equals(num1.sub(num2)));
    }
}