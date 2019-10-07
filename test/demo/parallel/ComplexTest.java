package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

//@RunWith(Arquillian.class)
public class ComplexTest {
//    @Deployment
//    public static JavaArchive createDeployment() {
//        return ShrinkWrap.create(JavaArchive.class)
//                .addClass(Complex.class)
//                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
//    }

    @Test
    public void testPositiveNumberSubjection() {
        Complex a = new Complex(7.7,5.5);
        Complex b = new Complex(2.3,3.2);
        Complex result = a.minus(b);
        assertEquals(new Complex(5.4,2.3), result);
    }

    @Test
    public void testNegativeNumberSubjection() {
        Complex a = new Complex(-7.7,-5.5);
        Complex b = new Complex(-2.3,-3.2);
        Complex result = a.minus(b);
        assertEquals(new Complex(-5.4,-2.3), result);
    }

    @Test
    public void testPositiveAndNegativeNumberSubjection() {
        Complex a = new Complex(7.7,-5.5);
        Complex b = new Complex(-2.3,8.9);
        Complex result = a.minus(b);
        assertEquals(new Complex(10,-14.4), result);
    }

    @Test
    public void testPositiveNumberDivide() {
        Complex a = new Complex(3,5);
        Complex b = new Complex(2,4);
        Complex result = a.divide(b);
        assertEquals(new Complex(1.3,-0.1), result);
    }

    @Test
    public void testNegativeNumberDivide() {
        Complex a = new Complex(-3,-5);
        Complex b = new Complex(-2,-4);
        Complex result = a.divide(b);
        assertEquals(new Complex(1.3,-0.1), result);
    }

    @Test
    public void testPositiveAndNegativeNumberDivide() {
        Complex a = new Complex(3,-5);
        Complex b = new Complex(-2,4);
        Complex result = a.divide(b);
        assertEquals(new Complex(-1.3,-0.1), result);
    }

    @Test (expected = java.lang.ArithmeticException.class)
    public void testDivideByZero() {
        Complex a = new Complex(3,-5);
        Complex b = new Complex(0,0);
        Complex result = a.divide(b);
        Assert.fail();
    }

    @Test
    public void testGetPositiveRe() {
        assertEquals(3, new Complex(3,-5).getRe(),0);
    }

    @Test
    public void testGetNegativeRe() {
        assertEquals(-3, new Complex(-3,-5).getRe(),0);
    }

    @Test
    public void testGetZeroRe() {
        assertEquals(0, new Complex(0,-5).getRe(),0);
    }

    @Test
    public void testGetPositiveIm() {
        assertEquals(5, new Complex(3,5).getIm(),0);
    }

    @Test
    public void testGetNegativeIm() {
        assertEquals(-5, new Complex(3,-5).getIm(),0);
    }

    @Test
    public void testGetZeroIm() {
        assertEquals(0, new Complex(3,0).getIm(),0);
    }
}
