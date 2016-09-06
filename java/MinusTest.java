import demo.parallel.Complex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by ррор on 06.09.2016.
 */
@RunWith(JUnit4.class)
public class MinusTest {

    @Test
    public void testMinus(){
        Complex c1 = new Complex(10,10);
        Complex c2 = new Complex(20,20);
        c2.minus(c1);
        assertNotNull(c2);
        assertEquals(c2.getRe(),10,0);
    }

}
