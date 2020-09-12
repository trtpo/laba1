import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.*;

public class OperationsTests {

    @Test
    public void divideTest() {
        Complex a = new Complex(55.5, 1.5);
        Complex b = new Complex(10.2, -2.5);
        a.divide(b);

        assertEquals(5.09, a.getRealPart(), 0.01);
        assertEquals(1.39, a.getImaginaryPart(), 0.01);
    }

    @Test
    public void divideByZeroTest() {
        Complex a = new Complex(55.5, 1.5);
        Complex b = new Complex(0, 0);
        a.divide(b);

        assertEquals(Double.NaN, a.getRealPart(), 0.01);
        assertEquals(Double.NaN, a.getImaginaryPart(), 0.01);
    }

    @Test
    public void subtractTest() {
        Complex a = new Complex(1.1, 2.2);
        Complex b = new Complex(-1.0, 2.2);
        a.minus(b);
        assertEquals(2.1, a.getRealPart(), 0.01);
        assertEquals(0, a.getImaginaryPart(), 0.01);
    }

    @Test
    public void cubeTest() {
        Complex a = new Complex(1.1, 1.2);
        a.cube();
        assertEquals(-3.42, a.getRealPart(), 0.01);
        assertEquals(2.62, a.getImaginaryPart(), 0.01);
    }

    @Test
    public void plusTest() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(-10, -20);
        a.plus(b);
        assertEquals(-9, a.getRealPart(), 0.01);
        assertEquals(-18, a.getImaginaryPart(), 0.01);
    }

    @Test
    public void lengthSqTest() {
        Complex a = new Complex(2.5, -10.4);
        assertEquals(114.41, a.lengthSQ(), 0.01);
    }

    @Test
    public void lengthSqZeroTest() {
        Complex a = new Complex(0.0, 0.0);
        assertEquals(0, a.lengthSQ(), 0.01);
    }

}
