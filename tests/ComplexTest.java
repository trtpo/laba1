import demo.parallel.Complex;
import junit.framework.TestCase;
import org.junit.Test;

public class ComplexTest extends TestCase {

    @Test
    public static void testMinus() {
        String msg = "Minus operation won't work";
        Complex a = new Complex(2, 4);
        Complex b = new Complex(1, 5);
        a.minus(b);
        assertTrue(msg, a.isEqual(new Complex(1, -1)));
    }

    @Test
    public static void testIsEqual() {
        String msg = "Equal operation won't work";
        Complex a = new Complex(2.7, 6);
        Complex b = new Complex(2.7, -1.9);
        assertTrue(msg, !a.isEqual(b));
    }

    @Test
    public static void testReciprocal() {
        String msg = "Reciprocal operation won't work";
        Complex a = new Complex(2.7, 6);
        Complex b = a.reciprocal();
        assertTrue(msg, b.isEqual(new Complex(0.062370062370062374, -0.1386001386001386)));
    }

    @Test
    public static void testDivides() {
        String msg = "Divide operation won't work";
        Complex a = new Complex(2.7, 6);
        Complex b = new Complex(5, 8);
        a.divides(b);
        assertTrue(msg, a.isEqual(new Complex(0.6910112359550562, 0.0943820224719101)));
    }

    @Test
    public static void testCos() {
        String msg = "Cos operation won't work";
        Complex a = new Complex(2.7, 6);
        Complex b = a.cos();
        assertTrue(msg, b.isEqual(new Complex(-182.3654872275628, -86.20814503849759)));
    }


}
