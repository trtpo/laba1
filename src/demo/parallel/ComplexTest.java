package demo.parallel;
        import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.*;
/**
 * Created by Alexander on 12.09.2016.
 */
public class ComplexTest {
    private Complex number;

    @Before
    public void setUp() throws Exception {
        number = new Complex(3, 4);
    }

    @Test
    public void minus() throws Exception {
        assertEquals(-1, number.minus(new Complex(4, 2)).getRe(), 0.00001);
        assertEquals(5, number.minus(new Complex(4, -3)).getIm(), 0.00001);
    }

    @Test
    public void sinTest () throws Exception{
        Complex testValue = new Complex(3,0);
        assertEquals(Complex.sin(testValue).getIm(),0, Double.MIN_VALUE);
    }
}

