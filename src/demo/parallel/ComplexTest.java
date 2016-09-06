package demo.parallel;
import org.junit.*;
import org.omg.CORBA.SystemException;

import static org.junit.Assert.*;

/**
 * Created by turok-m-a on 04.09.16.
 */
public class ComplexTest {
    @Test
    public void subtract() throws Exception {
        Complex tester = new Complex(25, 17);
        assertEquals("25+17i - (10+10i) must be 15+7i", 7.0 , tester.subtract(new Complex(10, 10)).getIm(), 0.001);
        assertEquals("25+17i - (10+10i) must be 15+7i",15.0 , tester.getRe(), 0.001);

    }

}