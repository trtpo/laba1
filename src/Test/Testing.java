package Test;


import demo.parallel.Complex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Maxon on 07.09.2016.
 */

@RunWith(JUnit4.class)
public class Testing {
    @Test
    public void testMinus() {
        Complex comp = new Complex(13, 17);
        Complex c = new Complex(1, 2);
        Complex result = comp.minus(c);
        assertNotNull(result);
        assertEquals(result.getIm(), 15, 3);
    }

}