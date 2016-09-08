package demo.parallel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by Aleksey on 08.09.2016.
 */
public class ComplexTest {
    private Complex number;

    @Before
     public void setUp() throws Exception {
         number = new Complex(3, 4);
           }

    @Test
     public void min() throws Exception {
         assertEquals(-1, number.min(new Complex(4, 2)).getRe(), 0.00001);
         assertEquals(5, number.min(new Complex(4, -3)).getIm(), 0.00001);
     }
}
