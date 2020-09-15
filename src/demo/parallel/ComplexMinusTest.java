package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexMinusTest {

    @Test
    public void minus() {
        Complex a = new Complex(10,10);
        Complex b = new Complex(10,10);
        Complex result = a.minus(b);

        Complex expected = new Complex(5,5);
        assertEquals(expected,result);
    }
}