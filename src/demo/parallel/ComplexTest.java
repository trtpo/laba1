package demo.parallel;

import junit.framework.TestCase;
import org.junit.Assert;

public class ComplexTest extends TestCase {
    Complex number1;
    Complex number2;

    public void setUp() throws Exception {
        number1 = new Complex(12,11);
        number2 = new Complex(3,8);
    }

    public void testMinus() {
        Complex difference = new Complex(9,3);
        number1.minus(number2);
        Assert.assertEquals(difference.getIm(),number1.getIm(),0.001);
        Assert.assertEquals(difference.getRe(),number1.getRe(),0.001);
    }

    public void testDivide() {
        Complex quotient = new Complex(1.6986301369863013,-0.863013698630137);
        number1.divide(number2);
        Assert.assertEquals(quotient.getIm(),number1.getIm(),0.001);
        Assert.assertEquals(quotient.getRe(),number1.getRe(),0.001);
    }
}
