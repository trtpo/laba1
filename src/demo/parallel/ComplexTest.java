package demo.parallel;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by ִלטענטי on 08.09.2015.
 */
public class ComplexTest {
    @Test
    public void testDiv() throws Exception {

        //test 1 : testing division by 0
        Complex test1 = new Complex(Double.MAX_VALUE, Double.MAX_VALUE);
        test1.div(new Complex(0,0));
        assertEquals(test1.getReal(), Double.NaN, Double.MIN_VALUE);
        assertEquals(test1.getImage(), Double.NaN, Double.MIN_VALUE);

        //test 2 : testing division for itself
        double r1 = Math.random() % 10;
        double im1 = Math.random() % 10;

        Complex test2 = new Complex(r1,im1);
        test2.div(new Complex(test2.getReal(), test2.getImage()));
        assertEquals(test2.getReal(), 1, Double.MIN_VALUE);
        assertEquals(test2.getImage(), 0, Double.MIN_VALUE);

        //test 3 : testing division for 1
        double r2 = Math.random() % 10;
        double im2 = Math.random() % 10;

        Complex test3 = new Complex(r2,im2);
        test3.div(new Complex(1, 0));
        assertEquals(test3.getReal(), r2, Double.MIN_VALUE);
        assertEquals(test3.getImage(), im2, Double.MIN_VALUE);
    }
}