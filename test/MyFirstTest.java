import demo.parallel.Complex;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 */
public class MyFirstTest {

    private Complex complex;

    @Before
    public void init() {
        complex = new Complex(2, 7);
    }

    @Test
    public void  testPlus() throws Exception {
        Complex result = complex.plus(new Complex(7, 2));
        assertEquals(9, complex.getRe(), 0.000001);
        assertEquals(9, complex.getIm(), 0.000001);
    }

    @Test
    public void  testMinus() throws Exception {
        Complex result = complex.minus(new Complex(7, 2));
        assertEquals(-5, complex.getRe(), 0.000001);
        assertEquals(+5, complex.getIm(), 0.000001);
    }
}