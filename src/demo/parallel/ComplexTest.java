package demo.parallel;
import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {
    @Test
    void checkSum() {
        Complex expectedResult = new Complex(4.0, 3.0);

        Complex num1 = new Complex(1, 1);
        Complex num2 = new Complex(3, 2);

        Complex result = num1.plus(num2);

        assertEquals(expectedResult.im(),result.im(),"imaginary parts are different");
        assertEquals(expectedResult.re(),result.re(),"real parts are diff");
        System.out.println("Sum check was success");
    }

    @Test
    void checkDiv() {
        Complex expectedResult = new Complex(1, -2);

        Complex num1 = new Complex(7, -4);
        Complex num2 = new Complex(3, 2);

        Complex result = num1.division(num2);

        assertEquals(expectedResult.im(),result.im(),"imaginary parts are different");
        assertEquals(expectedResult.re(),result.re(),"real parts are different");
        System.out.println("Division check was success");
    }



    @Test
    void checkMinus() {
        Complex expectedResult = new Complex(2, 4);

        Complex num1 = new Complex(5, 6);
        Complex num2 = new Complex(3, 2);

        Complex result = num1.minus(num2);

        assertEquals(expectedResult.im(),result.im(),"imaginary parts are different");
        assertEquals(expectedResult.re(),result.re(),"real parts are different");
        System.out.println("Subtraction check was success");
    }

    @Test
    void checkMulNum() {
        Complex expectedResult = new Complex(6, 6);
        double num = 2;

        Complex value = new Complex(3, 3);

        Complex result = value.mulNum(num);

        assertEquals(expectedResult.im(),result.im(),"imaginary parts are different");
        assertEquals(expectedResult.re(),result.re(),"real parts are different");
        System.out.println("Multiplication check was success");
    }
}