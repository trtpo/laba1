package demo.parallel;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ComplexTest {

    @Test
    public void minusTest() {
        Complex a = new Complex(4.7, 1.5);
        Complex b = new Complex(5.9, 7.4);

        Complex result = a.minus(b);

        assertEquals(4.7 - 5.9, result.getRe(), 0.0001);
        assertEquals(1.5 - 7.4, result.getIm(), 0.0001);
    }
}