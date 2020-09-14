package demo.parallel;

import junit.framework.TestCase;

class ComplexTest extends TestCase {
    Complex number1;
    Complex number2;

    @org.junit.jupiter.api.BeforeEach
    public void setUp()  {
        number1 = new Complex(4,6);
        number2 = new Complex(3,5);
    }

    @org.junit.jupiter.api.Test
    void plus() {
        Complex actual = number1.plus(number2);
        Complex expect = new Complex(7,11);
        assertEquals(actual.getRe(),expect.getRe());
        assertEquals(actual.getIm(),expect.getIm());
    }

    void length() {
        double actualFirst = number1.lengthSQ();
        double expectFirst = 52;
        assertEquals(expectFirst,actualFirst);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Complex actual = number1.subtract(number2);
        Complex expect = new Complex(1,1);
        assertEquals(actual.getRe(),expect.getRe());
        assertEquals(actual.getIm(),expect.getIm());
    }

    @org.junit.jupiter.api.Test
    void times() {
        Complex actual = number1.times(number2);
        Complex expect = new Complex(-18,38);
        assertEquals(actual.getRe(),expect.getRe());
        assertEquals(actual.getIm(),expect.getIm());
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Complex actual = number1.divide(number2);
        Complex expect = new Complex(1.23529,-0.05882);
        double delta=0.00009;
        assertEquals(actual.getRe(),expect.getRe(),delta);
        assertEquals(actual.getIm(),expect.getIm(),delta);
    }

    @org.junit.jupiter.api.Test
    void sinus() {
        Complex actualFirst = number1.sinus();
        Complex expectFirst = new Complex(-152.65839,-131.84778);
        double delta=0.0009;
        assertEquals(actualFirst.getRe(),expectFirst.getRe(),delta);
        assertEquals(actualFirst.getIm(),expectFirst.getIm(),delta);
    }

    @org.junit.jupiter.api.Test
    void cosinus() {
        Complex actualFirst = number1.cosinus();
        Complex expectFirst = new Complex(-131.84941,152.65651);
        double delta=0.0009;
        assertEquals(actualFirst.getRe(),expectFirst.getRe(),delta);
        assertEquals(actualFirst.getIm(),expectFirst.getIm(),delta);
    }
}