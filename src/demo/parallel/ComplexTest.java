package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    private Complex num1;
    private Complex num2;
    @Before
    public void setUp() throws Exception {
       num1 = new Complex(-2,3);
       num2 = new Complex(1,-4);
    }

    @Test
    public void minus() throws Exception {
        Complex num3 = num1.minus(num2);
        assertEquals("Test Re: error in the minus method of the Complex file ", -3,num3.getRe(),0);
        assertEquals("Test Im: error in the minus method of the Complex file",7,num3.getIm(),0);
    }

}