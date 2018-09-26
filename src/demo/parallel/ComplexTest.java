package demo.parallel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ComplexTest {
    @Test
    public void testAdd() {
        Complex a = new Complex(5, 33);
        Complex b = new Complex(4, 42);
        a.plus(b);
        assertEquals(a.getReal(),9, "Addition failed");
        assertEquals(a.getImaginary(), 75, "Addition failed");
    }
    @Test
    public void testMinus() {
        Complex a = new Complex(6, 22);
        Complex b = new Complex(11, 4);
        a.substraction(b);
        assertEquals(a.getReal(), -5, "Subtraction failed");
        assertEquals(a.getImaginary(), 18, "Subtraction failed");
    }
    @Test
    public void testTimes() {
        Complex a = new Complex(8, 8);
        Complex b = new Complex(10, 4);
        a.times(b);
        assertEquals(a.getReal(), 48, "Times failed");
        assertEquals(a.getImaginary(), 112, "Times failed");
    }
}