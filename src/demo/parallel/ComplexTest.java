package demo.parallel;

import static org.testng.Assert.assertEquals;

public class ComplexTest {

    Complex complex1;
    Complex complex2;

    @org.testng.annotations.BeforeMethod
    public void setUp() {
        complex1 = new Complex(7,1);
        complex2 = new Complex(0,3);
    }

    @org.testng.annotations.Test
    public void testSub() {
        var expected = new Complex(7, -2);
        complex1.sub(complex2);
        assertEquals(complex1.getIm(), expected.getIm());
        assertEquals(complex1.getRe(), expected.getRe());
    }

    @org.testng.annotations.Test(expectedExceptions = ArithmeticException.class, expectedExceptionsMessageRegExp = "Error! Division by zero")
    public void testDivZero() {
        complex1.div(new Complex(0,0));
    }

    @org.testng.annotations.Test
    public void testDiv() {
        var expected = new Complex(0.33333, -2.33333);
        complex1.div(complex2);
        double round=0.00005;
        assertEquals(complex1.getRe(), expected.getRe(),round);
        assertEquals(complex1.getIm(), expected.getIm(),round);
    }
}