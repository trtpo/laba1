package demo.parallel;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class Test_lab {
    private Complex number;

    @Before
    public void setUp() {
        number = new Complex(-2, 1);
    }

    @Test
    public void sub() {
        number.sub(new Complex(1,-4));
        assertEquals(-3, number.getRe(),0.00001);
        assertEquals(5, number.getIm(),0.00001);
    }

    @Test
    public void div() {
        number.div(new Complex(1,-1));
        assertEquals(-1.5, number.getRe(),0.00001);
        assertEquals(-0.5, number.getIm(),0.00001);
    }
}
