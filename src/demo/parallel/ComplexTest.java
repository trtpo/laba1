package demo.parallel;

import demo.parallel.Complex;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.*;

import static org.junit.Assert.*;

public class ComplexTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before ComplexTest.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("After ComplexTest.class");
    }

    @Test
    public void testPlus() throws Exception {
        Complex x = new Complex(-3,2);
        Complex y = new Complex(2,0);
        x.plus(y);
        assertEquals(-1, x.getRe(),0.001);
        assertEquals(2, x.getIm(),0.001);
    }

    @Test
    public void testMinus() throws Exception {
        Complex x = new Complex(-3,2);
        Complex y = new Complex(2,0);
        x.minus(y);
        assertEquals(-5,x.getRe(),0.001);
        assertEquals(2,x.getIm(),0.001);
    }

    @Test
    public void testTimes() throws Exception {
        Complex x = new Complex(-3,2);
        Complex y = new Complex(2,0);
        x.times(y);
        assertEquals(-6,x.getRe(),0.001);
        assertEquals(4,x.getIm(),0.001);
    }

    @Test
    public void testDivide() throws Exception {
        Complex x = new Complex(-6,2);
        Complex y = new Complex(2,2);
        x.division(y);
        Complex expect = new Complex(-1,2);
        assertEquals(-1,x.getRe(),0.001);
        assertEquals(2,expect.getIm(),0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideWithException() throws Exception {
        Complex x = new Complex(-6, 2);
        Complex y = new Complex(0, 0);
        x.division(y);
    }

    @Test
    public void testMod() throws Exception {
        Complex x = new Complex(-1,5);
        x.mod();
        assertEquals(1,x.getRe(),0.001);
        assertEquals(5,x.getIm(),0.001);
    }

}