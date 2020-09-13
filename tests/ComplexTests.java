import demo.parallel.Complex;
import org.junit.Test;

import java.util.function.BiFunction;

import static org.junit.Assert.*;

public class ComplexTests {

    private void testOperandImmutability(BiFunction<Complex, Complex, Complex> op) {
        Complex a = new Complex(1.0, -1.0);
        Complex b = new Complex(3.0, -1.5);
        Complex check = new Complex(b.getReal(), b.getImaginary());
        op.apply(a, b);
        assertEquals(check.getReal(), b.getReal(), 0.01);
        assertEquals(check.getImaginary(), b.getImaginary(), 0.01);
    }

    @Test
    public void testComplexOperandImmutability() {
        testOperandImmutability(Complex::plus);
        testOperandImmutability(Complex::times);
        testOperandImmutability(Complex::minus);
        testOperandImmutability(Complex::divide);
    }

    @Test
    public void testComplexPlus() {
        Complex a = new Complex(1.0, -1.0);
        final  Complex b = new Complex(3.0, -1.5);
        a.plus(b);

        assertEquals(4, a.getReal(), 0.01);
        assertEquals(-2.5, a.getImaginary(), 0.01);
    }

    @Test
    public void testComplexMinus() {
        Complex a = new Complex(1.0, -1.0);
        final  Complex b = new Complex(3.0, -1.5);
        a.minus(b);

        assertEquals(-2, a.getReal(), 0.01);
        assertEquals(0.5, a.getImaginary(), 0.01);
    }

    @Test
    public void testComplexDivide() {
        Complex a = new Complex(1.0, -1.0);
        final  Complex b = new Complex(3.0, -1.5);
        a.divide(b);

        assertEquals(0.4, a.getReal(), 0.01);
        assertEquals(-0.133, a.getImaginary(), 0.01);
    }

    @Test
    public void testComplexTimes() {
        Complex a = new Complex(1.0, -1.0);
        final  Complex b = new Complex(3.0, -1.5);
        a.times(b);

        assertEquals(1.5, a.getReal(), 0.01);
        assertEquals(-4.5, a.getImaginary(), 0.01);
    }

    @Test
    public void testComplexSquare() {
        Complex a = new Complex(1.0, -1.0);
        a.square();

        assertEquals(0, a.getReal(), 0.01);
        assertEquals(-2, a.getImaginary(), 0.01);
    }

    @Test
    public void testComplexSquareIsTimesSelf() {
        Complex a = new Complex(1.0, -1.0);
        Complex b = new Complex(a.getReal(), a.getImaginary());

        a.square();
        b.times(b);

        assertTrue(Math.abs(a.getReal() - b.getReal()) < 0.01);
        assertTrue(Math.abs(a.getImaginary() - b.getImaginary()) < 0.01);

        assertEquals(0, a.getReal(), 0.01);
        assertEquals(-2, a.getImaginary(), 0.01);

        assertEquals(0, b.getReal(), 0.01);
        assertEquals(-2, b.getImaginary(), 0.01);
    }

}
