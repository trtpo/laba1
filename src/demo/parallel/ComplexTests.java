package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ComplexTests {
    Complex testNum = new Complex(3, 4);

    @Test
    public void minus() throws Exception{
        assertEquals(new Complex(1, 1), testNum.minus(new Complex(2, 3)));
    }

    @Test
    public void pow() throws Exception{
        assertEquals(testNum.pow(2), new Complex(-7, 24));
        assertEquals(testNum.pow(0), new Complex(1, 0));
    }

}
