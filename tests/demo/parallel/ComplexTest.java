package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void minusPositive() {
        Complex minuend = new Complex(12, 11);
        Complex subtrahend = new Complex(5, 7);
        Complex result = new Complex(7, 4);
        minuend = minuend.minus(subtrahend);
        assert (minuend.getIm() == result.getIm() && minuend.getRe() == result.getRe());
    }

    @Test
    void minusNegative() {
        Complex minuend = new Complex(-12, -11);
        Complex subtrahend = new Complex(-5, -7);
        Complex result = new Complex(-7, -4);
        minuend = minuend.minus(subtrahend);
        assert (minuend.getIm() == result.getIm() && minuend.getRe() == result.getRe());
    }

    @Test
    void minusZero() {
        Complex minuend = new Complex(0, 0);
        Complex subtrahend = new Complex(0, 0);
        Complex result = new Complex(0, 0);
        minuend = minuend.minus(subtrahend);
        assert (minuend.getIm() == result.getIm() && minuend.getRe() == result.getRe());
    }

    @Test
    void divideEqual() {
        Complex dividend = new Complex(7, 3);
        Complex divider = new Complex(7, 3);
        Complex result = new Complex(1, 0);
        dividend = dividend.divide(divider);
        assert (dividend.getIm() == result.getIm() && dividend.getRe() == result.getRe());
    }

    @Test
    void divideDifferent() {
        Complex dividend = new Complex(10, 3);
        Complex divider = new Complex(1, -3);
        Complex result = new Complex(0.1, 3.3);
        dividend = dividend.divide(divider);
        assert (dividend.getIm() == result.getIm() && dividend.getRe() == result.getRe());
    }
}