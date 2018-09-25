package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    final public void subtractionOfNumbers1() {
        Complex a = new Complex(1,1);
        Complex b = new Complex(3,4);
        Complex actual = a.minus(b);
        Complex expected = new Complex(-2,-3);

        double actualRe = actual.getRe();
        double actualIm = actual.getIm();
        double expectedRe = expected.getRe();
        double expectedIm = expected.getIm();

        assertEquals(expectedRe, actualRe, 0);
        assertEquals(expectedIm, actualIm, 0);
    }

    @Test
    final public void subtractionOfNumbers2() {
        Complex a = new Complex(0,0);
        Complex b = new Complex(0,0);
        Complex actual = a.minus(b);
        Complex expected = new Complex(0,0);

        double actualRe = actual.getRe();
        double actualIm = actual.getIm();
        double expectedRe = expected.getRe();
        double expectedIm = expected.getIm();

        assertEquals(expectedRe, actualRe, 0);
        assertEquals(expectedIm, actualIm, 0);
    }

    @Test
    final public void subtractionOfNumbers3() {
        Complex a = new Complex(12359.2134,23521.234);
        Complex b = new Complex(-2352.2335,123523.34);
        Complex actual = a.minus(b);
        Complex expected = new Complex(14711.4469,-100002.106);

        double actualRe = actual.getRe();
        double actualIm = actual.getIm();
        double expectedRe = expected.getRe();
        double expectedIm = expected.getIm();

        assertEquals(expectedRe, actualRe, 0);
        assertEquals(expectedIm, actualIm, 0);
    }

    @Test
    final public void divisionOfNumbers1() {
        Complex a = new Complex(0,0);
        Complex b = new Complex(23,-2);
        Complex actual = a.divideBy(b);
        Complex expected = new Complex(0,0);

        double actualRe = actual.getRe();
        double actualIm = actual.getIm();
        double expectedRe = expected.getRe();
        double expectedIm = expected.getIm();

        assertEquals(expectedRe, actualRe, 0);
        assertEquals(expectedIm, actualIm, 0);
    }

    @Test
    final public void divisionOfNumbers2() {
        Complex a = new Complex(1,1);
        Complex b = new Complex(1,1);
        Complex actual = a.divideBy(b);
        Complex expected = new Complex(1,0);

        double actualRe = actual.getRe();
        double actualIm = actual.getIm();
        double expectedRe = expected.getRe();
        double expectedIm = expected.getIm();

        assertEquals(expectedRe, actualRe, 0);
        assertEquals(expectedIm, actualIm, 0);
    }
    @Test
    final public void divisionOfNumbers3() {
        Complex a = new Complex(423,214);
        Complex b = new Complex(-234,372);
        Complex actual = a.divideBy(b);
        Complex expected = new Complex(-0.10031065548306928,-0.25907986142777417);

        double actualRe = actual.getRe();
        double actualIm = actual.getIm();
        double expectedRe = expected.getRe();
        double expectedIm = expected.getIm();

        assertEquals(expectedRe, actualRe, 0);
        assertEquals(expectedIm, actualIm, 0);
    }
}