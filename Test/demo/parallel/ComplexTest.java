package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void division() {
        Complex a = new Complex(5, 4);
        Complex b = new Complex(5, 4);

        Complex expected = a.division(b);

        Complex rightResult = new Complex(1 ,0);
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

        Complex rightResult = new Complex(7.7463130074030735 , 26.168964053872834);
        assertEquals(rightResult, expected);
    }

    @Test
    public void tg() {
        Complex a = new Complex(5, 4);
        Complex expected = a.tg();

        Complex rightResult = new Complex(-3.6520305451135537E-4 , -1.0005630461157935);
        assertEquals(rightResult, expected);
    }

    @Test
    public void ctg() {
        Complex a = new Complex(5, 4);
        Complex expected = a.ctg();

        Complex rightResult = new Complex(-3.647921006604113E-4 , 0.9994371375785175);
        assertEquals(rightResult, expected);
    }
}