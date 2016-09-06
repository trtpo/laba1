package Test;

import demo.parallel.Complex;
import static org.junit.Assert.*;

/**
 * Created by ZhartunMatthew on 06.09.2016.
 */
public class ComplexTest {

    @org.junit.Test
    public void minusTest() throws Exception {
        Complex first = new Complex(10.0, 10.0);
        Complex second = new Complex(6.0, 6.0);

        Complex expected = new Complex(4.0,4.0);
        Complex result = first.minus(second);

        assertEquals(expected.getRe(), result.getRe(), 0);
        assertEquals(expected.getIm(), result.getIm(), 0);

    }

    @org.junit.Test
    public void divisionTest() throws Exception {
        Complex first = new Complex(10.0, 8.0);
        Complex second = new Complex(4.0, 2.0);

        Complex expected = new Complex(2.8, 0.6);
        Complex result = first.division(second);

        assertEquals(expected.getRe(), result.getRe(), 0);
        assertEquals(expected.getIm(), result.getIm(), 0);
    }

}