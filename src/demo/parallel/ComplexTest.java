package demo.parallel;

import demo.parallel.Complex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author
 */

@RunWith(JUnit4.class)
public class ComplexTest {

    @Test
    public void minusimagTest(){
        Complex comp = new Complex(8,16);
        Complex c = new Complex(3,5);
        Complex result = comp.minusimag(c);
        assertNotNull(result);
        assertEquals(result.getIm(),15,0);
        assertEquals(result.getReal(),11,0);
    }

}