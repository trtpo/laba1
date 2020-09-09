package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void testDivide() {
        assertEquals(new Complex(4, 2).lengthSQ(),
                new Complex(2, 6).divide(new Complex(1, 1)).lengthSQ(),
                0.001);

        assertEquals(new Complex(25, 0).lengthSQ(),
                new Complex(50, 100).divide(new Complex(2, 4)).lengthSQ(),
                0.001);

        assertEquals(Double.NaN,
                new Complex(0, 0).divide(new Complex(0, 0)).lengthSQ(),
                0.001);
    }

    @Test
    public void testAddTwoTimes() {
        assertEquals(new Complex(4, 8).lengthSQ(),
                new Complex(2, 6).addTwoTimes(new Complex(1, 1)).lengthSQ(),
                0.001);

        assertEquals(new Complex(33, 18).lengthSQ(),
                new Complex(21, 2).addTwoTimes(new Complex(6, 8)).lengthSQ(),
                0.001);

        assertEquals(new Complex(33, 14).lengthSQ(),
                new Complex(21, -2).addTwoTimes(new Complex(6, 8)).lengthSQ(),
                0.001);
    }

    @Test
    public void testPlusThenTimes() {
        assertEquals(new Complex(-3, 7).lengthSQ(),
                new Complex(1, 4).plusThenTimes(new Complex(1, 1)).lengthSQ(),
                0.001);

        assertEquals(new Complex(114, 252).lengthSQ(),
                new Complex(21, -2).plusThenTimes(new Complex(6, 8)).lengthSQ(),
                0.001);

        assertEquals(new Complex(1102, -444).lengthSQ(),
                new Complex(33, -14).plusThenTimes(new Complex(21, -2)).lengthSQ(),
                0.001);
    }
}
