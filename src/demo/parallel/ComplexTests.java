package demo.parallel;


import org.junit.Test;
import  static org.junit.Assert.assertEquals;

public class ComplexTests {

    Complex testN = new Complex(3, 4);

    @Test
    public void minus() throws Exception {
        assertEquals(new Complex(1, 1), testN.minus(new Complex(2, 3)));
    }

    @Test
    public void times() throws Exception {
        assertEquals(testN.times(10.0), new Complex(30, 40));
    }
}
