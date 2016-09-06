package demo.parallel;

/**
 * Created by julia on 07.09.16.
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ComplexTest {
    @Test
    public void sinTest () throws Exception{
        Complex testValue = new Complex(3,0);
        assertEquals(Complex.sin(testValue).GetReal(),0, Double.MIN_VALUE);
    }
}
