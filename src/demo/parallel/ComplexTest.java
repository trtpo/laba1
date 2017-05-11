package demo.parallel;

/**
 * Created by Chamamilla on 01.05.2017.
 */

import org.junit.Test;

//import static org.junit.Assert.assertEquals;
import org.junit.*;
public class ComplexTest {
    @Test
    public void divTest(){
        Complex a = new Complex(3,5);
        Complex b = new Complex(4,2);
        Complex c = a.div(b);
        Complex d = new Complex(1.1, 0.7);
        //assertEquals("complex not equal",c , d);
        Assert.assertTrue(c.equals(d));
    }

    @Test
    public void minusTest() {
        Complex a = new Complex(4, 2);
        Complex b = new Complex(1, 5);

        Complex c = new Complex(3, -3);
        Assert.assertTrue(c.equals(a.minus(b)));
    }
}
