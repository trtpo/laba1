package demo.parallel;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ComplexTest {

    @Test
    public void minus() {
        Complex expectedResult = new Complex(4, 3);

        Complex num1 = new Complex(7, 11);
        Complex num2 = new Complex(3, 8);

        Complex result = num1.minus(num2);

        assertEquals(expectedResult.im(),result.im(),"imaginary parts are different");
        assertEquals(expectedResult.re(),result.re(),"real parts are different");
        System.out.println("Subtraction check was success");
    }

    @Test
    public void division() {
        Complex expectedResult = new Complex(1, -2);

        Complex num1 = new Complex(7, -4);
        Complex num2 = new Complex(3, 2);

        Complex result = num1.division(num2);

        assertEquals(expectedResult.im(),result.im(),"imaginary parts are different");
        assertEquals(expectedResult.re(),result.re(),"real parts are different");
        System.out.println("Division check was success");
    }

    @Test
    public void mulNum() {
        Complex expectedResult = new Complex(35, 14);
        double num = 7;

        Complex value = new Complex(5, 2);

        Complex result = value.mulNum(num);

        assertEquals(expectedResult.im(),result.im(),"imaginary parts are different");
        assertEquals(expectedResult.re(),result.re(),"real parts are different");
        System.out.println("Multiplication check was success");
    }
}