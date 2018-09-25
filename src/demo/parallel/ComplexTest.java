package demo.parallel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ComplexTest {
    private static final double DELTA = 1e-15;
    @Test
    public void testAdd() {
        Complex a = new Complex(5, 38);
        Complex b = new Complex(4, 28);
        a.plus(b);
        assertEquals(a.getReal(),9);
        assertEquals(a.getImaginary(), 66);
    }
    @Test
    public void testMinus() {
        Complex a = new Complex(6, 8);
        Complex b = new Complex(10, 4);
        a.substraction(b);
        assertEquals(a.getReal(), -4);
        assertEquals(a.getImaginary(), 4);
    }
    @Test
    public void testTimes() {
        Complex a = new Complex(6, 8);
        Complex b = new Complex(10, 4);
        a.times(b);
        assertEquals(a.getReal(), 28);
        assertEquals(a.getImaginary(), 104);
    }
}