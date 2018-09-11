import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    public void divideTestsZero() {
        demo.parallel.Complex a = new demo.parallel.Complex(1, 1);
        demo.parallel.Complex b = new Complex(0, 0);
        assertEquals(a.divide(b), null);
    }

    @Test
    public void divideTest() {
        demo.parallel.Complex a = new demo.parallel.Complex(-2, 1);
        demo.parallel.Complex b = new Complex(1, -1);
        Complex c = a.divide(b);
        assertEquals(c.getRe(), -1.5);
        assertEquals(c.getIm(), -0.5);
    }

    @Test
    public void minusTest() {
        demo.parallel.Complex a = new demo.parallel.Complex(-2, 1);
        demo.parallel.Complex b = new Complex(1, -1);
        Complex c = a.minus(b);
        assertEquals(c.getRe(), -3);
        assertEquals(c.getIm(), 2);
    }

}