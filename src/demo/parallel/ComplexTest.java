package demo.parallel;

import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    Complex number1;
    Complex number2;

    @org.junit.jupiter.api.BeforeEach
    public void setUp()  {
        number1 = new Complex(4,6);
        number2 = new Complex(3,5);
    }

    @Test
    void plus() {
        Complex actual = number1.plus(number2);
        Complex expect = new Complex(7,11);
        assertEquals(actual.getReal(),expect.getReal());
        assertEquals(actual.getImaginary(),expect.getImaginary());
    }

    void length() {
        double actualFirst = number1.lengthSQ();
        double expectFirst = 52;
        assertEquals(expectFirst,actualFirst);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Complex actual = number1.minus(number2);
        Complex expect = new Complex(1,1);
        assertEquals(actual.getReal(),expect.getReal());
        assertEquals(actual.getImaginary(),expect.getImaginary());
    }

    @org.junit.jupiter.api.Test
    void times() {
        Complex actual = number1.times(number2);
        Complex expect = new Complex(-18,38);
        assertEquals(actual.getReal(),expect.getReal());
        assertEquals(actual.getImaginary(),expect.getImaginary());
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Complex actual = number1.divide(number2);
        Complex expect = new Complex(1.23529,-0.05882);
        double delta=0.00009;
        assertEquals(actual.getReal(),expect.getReal(),delta);
        assertEquals(actual.getImaginary(),expect.getImaginary(),delta);
    }

}
