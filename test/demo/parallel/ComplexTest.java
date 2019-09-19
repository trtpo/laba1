package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {

    @Test
    public void minus() {
        Complex a = new Complex(5, 4);
        Complex b = new Complex(4, 3);

        Complex expected = a.minus(b);

        Complex rightResult = new Complex(1, 1);
        assertEquals(rightResult, expected);
    }

    @Test
    public void divide() {
        Complex a = new Complex(5, 4);
        Complex b = new Complex(5, 4);

        Complex expected = a.divide(b);

        Complex rightResult = new Complex(1, 0);
        assertEquals(rightResult, expected);
    }

    @Test
    public void sin() {
        Complex a = new Complex(5, 4);
        Complex expected = a.sin();
        Complex rightResult = new Complex(-26.18652736460921, 7.741117553247739);
        assertEquals(rightResult, expected);
    }

    @Test
    public void cos() {
        Complex a = new Complex(5, 4);
        Complex expected = a.cos();

        Complex rightResult = new Complex(7.7463130074030735, 26.168964053872834);
        assertEquals(rightResult, expected);
    }
}