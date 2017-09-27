package demo.parallel;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void minus() throws Exception {
        Complex num = new Complex(4,8);
        assertTrue(new Complex(2,3).equals(num.minus(new Complex(2,5))));
    }

    @Test
    public void divide() throws Exception {
        Complex num = new Complex(4,8);
        assertTrue(new Complex(4,8).equals(num.divide(new Complex(0,0))));

    }


}