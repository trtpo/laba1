package demo.parallel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ComplexTest {

    @Test
    public void testTimes() {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(4, 5);
        Complex result = a.times(b);
        assertEquals(-7, result.re, 0.001);
        assertEquals(22, result.im, 0.001);
    }

    @Test
    public void testPlus() {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(4, 5);
        Complex result = a.plus(b);
        assertEquals(6, result.re, 0.001);
        assertEquals(8, result.im, 0.001);
    }

    @Test
    public void testDivide() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(2, 1);
        Complex result = a.divide(b);
        assertEquals(0.8, result.re, 0.001);
        assertEquals(0.6, result.im, 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Complex a = new Complex(2, 3);
        Complex zero = new Complex(0, 0);
        Complex result = a.divide(zero); // Должно вызвать ArithmeticException
    }

    @Test
    public void testLengthSQ() {
        Complex a = new Complex(3, 4);
        double lengthSQ = a.lengthSQ();
        assertEquals(25, lengthSQ, 0.001);
    }

    @Test
    public void testMinus() {
        Complex a = new Complex(5, 8);
        Complex b = new Complex(2, 3);
        Complex result = a.minus(b);
        // Добавьте утверждения для проверки результата, например:
        assertEquals(3, result.re, 0.001);
        assertEquals(5, result.im, 0.001);
    }

}
