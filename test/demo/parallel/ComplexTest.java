package demo.parallel;

import junit.framework.TestCase;
import org.junit.Test;

public class ComplexTest extends TestCase {
    Complex firstComplexNum = new Complex(4,5);
    Complex secondComplexNum = new Complex(7,8);

    @Test
    public void testPlus() {

        Complex actual = firstComplexNum.plus(secondComplexNum);
        Complex expected = new Complex(11,13);

        assertEquals(expected.getRe(),actual.getRe());
        assertEquals(expected.getIm(),actual.getIm());
    }
    @Test
    public void testMinus() {

        Complex actual = firstComplexNum.minus(secondComplexNum);
        Complex expected = new Complex(-3,-3);

        assertEquals(expected.getRe(),actual.getRe());
        assertEquals(expected.getIm(),actual.getIm());
    }
    @Test
    public void testTimes() {
        Complex actual = firstComplexNum.times(secondComplexNum);
        Complex expected = new Complex(-12,67);

        assertEquals(expected.getRe(),actual.getRe());
        assertEquals(expected.getIm(),actual.getIm());
    }
    @Test
    public void testLengthSQ() {
       double actualFirst = firstComplexNum.lengthSQ();
       double actualSecond = secondComplexNum.lengthSQ();
       double expectedFirst = 41;
       double expectedSecond = 113;
       assertEquals(expectedFirst,actualFirst);
       assertEquals(expectedSecond,actualSecond);
    }
    @Test
    public void testDivison() {
        Complex actual = firstComplexNum.divison(secondComplexNum);
        Complex expected = new Complex(0.60177,0.0265);
        double delta = 0.00009;
        assertEquals(expected.getRe(),actual.getRe(),delta);
        assertEquals(expected.getIm(),actual.getIm(),delta);
    }
}