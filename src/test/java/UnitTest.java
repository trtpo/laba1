import demo.parallel.Complex;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTest {
    private Complex number;

    @Before
    public void before() throws Exception {
        number = new Complex(5, 8);
    }

    @Test
    public void minusTest() throws Exception {
        number.minus(new Complex(1, 2));
        assertEquals(4, number.getRe(), 1e-15);
        assertEquals(6, number.getIm(), 1e-15);
    }
    @Test
    public void plusTest() throws Exception {
        number.plus(new Complex(1, 2));
        assertEquals(6, number.getRe(), 1e-15);
        assertEquals(10, number.getIm(), 1e-15);
    }
    @Test
    public void multiplyTest() throws Exception {
        number.multiply(new Complex(1, 2));
        assertEquals(5, number.getRe(), 1e-15);
        assertEquals(16, number.getIm(), 1e-15);
    }
    @Test
    public void multipleOperatonTest() throws Exception {
        number.plus(new Complex(1, 2)).minus(new Complex(2,3));
        assertEquals(4, number.getRe(), 1e-15);
        assertEquals(7, number.getIm(), 1e-15);
    }
}

