/**
 * Created by о on 21.09.2017.
 */

package demo.parallel;


import org.junit.Test;

import static org.junit.Assert.assertTrue;




public class ComlexTest {
    private Complex result,begin;


    @Test
     public void testSub() throws Exception {
        begin = new Complex(5,-6);
        Complex temporary = new Complex(8,-8);
         result = begin.minus(new Complex(-3,2));
         boolean cheked = temporary.equals(result);
        assertTrue("This function isn't work correctly.", cheked);
        }


}
