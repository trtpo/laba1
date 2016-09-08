import demo.parallel.Complex;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 08.09.2016.
 */

public class ComplexTest {
    private Complex complexNumber;

    @Before public void setup() {
        complexNumber = new Complex(4,6);
    }

    @org.junit.Test
    public void plus() throws Exception {
        complexNumber.plus(new Complex(3,4));
        assertEquals(2, complexNumber.getRe(), 0.0001);
        assertEquals(0, complexNumber.getIm(), 0.0001);
    }

    @org.junit.Test
    public void times() throws Exception {
        complexNumber.plus(new Complex(3,4));
        assertEquals(36, complexNumber.getRe(), 0.0001);
        assertEquals(34, complexNumber.getIm(), 0.0001);
    }

    @org.junit.Test
    public void rise() throws Exception {
        complexNumber.plus(new Complex(3,4));
        assertEquals(13.5, complexNumber.getRe(), 0.0001);
        assertEquals(-1, complexNumber.getIm(), 0.0001);
    }
}