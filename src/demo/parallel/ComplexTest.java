package demo.parallel;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ComplexTest {

    @Test
    public void testPlus() {
        Complex expectedResult = new Complex(4,3);
        Complex num1 = new Complex(1,1);
        Complex num2 = new Complex(3,2);
        Complex result = num1.plus(num2);
        assertEquals(expectedResult.getRe(), result.getRe(), "Real parts are different");
        assertEquals(expectedResult.getIm(), result.getIm(), "Imaginary parts are different");
    }

    @Test
    public void testMinus() {
        Complex expectedResult = new Complex(1,1);
        Complex num1 = new Complex(4,3);
        Complex num2 = new Complex(3,2);
        Complex result = num1.minus(num2);
        assertEquals(expectedResult.getRe(), result.getRe(), "Real parts are different");
        assertEquals(expectedResult.getIm(), result.getIm(), "Imaginary parts are different");
        System.out.println("Test completed");
    }

    @Test
    public void testMultiply() {
        Complex expectedResult = new Complex(4,4);
        Complex num1 = new Complex(2,2);
        double num2 = 2;
        Complex result = num1.multiplyNum(num2);
        assertEquals(expectedResult.getRe(), result.getRe(), "Real parts are different");
        assertEquals(expectedResult.getIm(), result.getIm(), "Imaginary parts are different");
    }

    @Test
    public void testDivide() {
        Complex expectedResult = new Complex(2,2);
        Complex num1 = new Complex(4,4);
        double num2 = 2;
        Complex result = num1.multiplyNum(num2);
        assertEquals(expectedResult.getRe(), result.getRe(), "Real parts are different");
        assertEquals(expectedResult.getIm(), result.getIm(), "Imaginary parts are different");
    }
}
