import demo.parallel.Complex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author n.kragel
 */

@RunWith(JUnit4.class)
public class FormulaTest {

    @Test
    public void testMinus(){
        Complex comp = new Complex(10,20);
        Complex c = new Complex(1,2);
        Complex result = comp.minus(c);
        assertNotNull(result);
        assertEquals(result.getIm(),18,0);
    }

}
