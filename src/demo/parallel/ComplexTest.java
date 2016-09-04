package demo.parallel;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vladimir on 04.09.2016.
 */
public class ComplexTest  {
    private Complex number;
    @Before
    public void setUp() throws Exception {
        number = new Complex(1,2);
    }

    @Test
    public void minus() throws Exception {
        number.minus(new Complex(2,3));
        assertEquals(-1,number.getRe(),0.0001);
        assertEquals(-1,number.getIm(),0.0001);
    }
}
