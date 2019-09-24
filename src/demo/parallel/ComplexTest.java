package demo.parallel;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {

    @Test
    public void subtraction() {
        Complex result = new Complex(3, 4).minus(new Complex(1, 2));
        assertEquals((long) result.getReal(), 2);
        assertEquals((long) result.getImaginary(), 2);
    }

    @Test
    public void division() {
        Complex number1 = new Complex(3, 4),
                number2 = new Complex(5, 12);
        double arg1 = number1.getArgument(),
                arg2 = number2.getArgument();
        number2.divide(number1);
        assertEquals(number2.getImaginary(), 13. / 5. * Math.sin(arg2 - arg1), 0.0001);
        assertEquals(number2.getReal(), 13. / 5. * Math.cos(arg2 - arg1), 0.0001);
        assertEquals(number2.getArgument(), arg2 - arg1);
    }

    @Test
    public void arg() {
        Complex number = new Complex(1, 1);
        assertEquals(number.getArgument(), Math.PI / 4);

        number = new Complex(3, 4);
        assertEquals(number.getArgument(), Math.asin(4. / 5.), 0.0001);
    }

    @Test
    public void adding() {
        Complex number1 = new Complex(1, 1),
                number2 = new Complex(3, 4);
        number2.plus(number1);
        assertEquals(number2.getReal(), 4);
        assertEquals(number2.getImaginary(), 5);
    }

    @Test
    public void multiplication() {
        Complex number1 = new Complex(3, 4),
                number2 = new Complex(5, 12);
        double arg1 = number1.getArgument(),
                arg2 = number2.getArgument();
        number2.multiply(number1);
        assertEquals(number2.getImaginary(), 13. * 5. * Math.sin(arg2 + arg1), 0.0001);
        assertEquals(number2.getReal(), 13. * 5. * Math.cos(arg2 + arg1), 0.0001);
        assertEquals(number2.getArgument(), arg2 + arg1);
    }


}