package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ComplexNumberOperationsTest {

    Complex a = new Complex(7, 4);
    Complex b = new Complex(-2, 1);

    @Test
    public void additionResultShouldBeCorrect() {

        a.plus(b);
        assertArrayEquals(new double[] {5, 5}, new double[] {a.getRe(), a.getIm()}, 0.001);
    }

    @Test
    public void divisionResultShouldBeCorrect() {

        a.divideBy(b);
        assertArrayEquals(new double[] {-2, -3}, new double[] {a.getRe(), a.getIm()}, 0.001);
    }

    @Test
    public void multiplicationResultShouldBeCorrect() {

        a.times(b);
        assertArrayEquals(new double[] {-18, -1}, new double[] {a.getRe(), a.getIm()}, 0.001);
    }

    @Test
    public void subtractionResultShouldBeCorrect() {

        a.minus(b);
        assertArrayEquals(new double[] {9, 3}, new double[] {a.getRe(), a.getIm()}, 0.001);
    }
}
