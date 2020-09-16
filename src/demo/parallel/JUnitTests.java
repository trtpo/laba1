package demo.parallel;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JUnitTests {

    @Test
    void checkSum() {
        Complex expectedResult = new Complex(4.0, 4.0);

        Complex num1 = new Complex(1, 2);
        Complex num2 = new Complex(3, 2);

        Complex result = num1.plus(num2);

        assertEquals(expectedResult.im(),result.im(),"image parts of Complex value are diff");
        assertEquals(expectedResult.re(),result.re(),"real parts of Complex value are diff");
        System.out.println("Sum check was success");
    }

    @Test
    void checkDivision() {
        Complex expectedResult = new Complex(1, -1.0769230769230769);

        Complex num1 = new Complex(7, -4);
        Complex num2 = new Complex(3, 2);

        Complex result = num1.division(num2);

        assertEquals(expectedResult.im(),result.im(),"image parts of Complex value are diff");
        assertEquals(expectedResult.re(),result.re(),"real parts of Complex value are diff");
        System.out.println("Division check was success");
    }

    @Test
    void checkTimes() {
        Complex expectedResult = new Complex(-1, 8);

        Complex num1 = new Complex(1, 2);
        Complex num2 = new Complex(3, 2);

        Complex result = num1.times(num2);

        assertEquals(expectedResult.im(),result.im(),"image parts of Complex value are diff");
        assertEquals(expectedResult.re(),result.re(),"real parts of Complex value are diff");
        System.out.println("Multiplication check was success");
    }

    @Test
    void checkMinus() {
        Complex expectedResult = new Complex(4, 5);

        Complex num1 = new Complex(7, 7);
        Complex num2 = new Complex(3, 2);

        Complex result = num1.minus(num2);

        assertEquals(expectedResult.im(),result.im(),"image parts of Complex value are diff");
        assertEquals(expectedResult.re(),result.re(),"real parts of Complex value are diff");
        System.out.println("Subtraction check was success");
    }

    @Test
    void checkMulNum() {
        Complex expectedResult = new Complex(4, 4);
        double num = 2;

        Complex value = new Complex(2, 2);

        Complex result = value.mulNumber(num);

        assertEquals(expectedResult.im(),result.im(),"image parts of Complex value are diff");
        assertEquals(expectedResult.re(),result.re(),"real parts of Complex value are diff");
        System.out.println("Multiplication num check was success");
    }
}
