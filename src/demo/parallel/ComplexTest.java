{
    Complex number1;
    Complex number2;
    Complex number3;
    Complex number4;
    Complex number5;

    @Before
    public void setUp() throws Exception {
        number1 = new Complex(12, 11);
        number2 = new Complex(3, 8);
        number3 = new Complex(4, 8);
        number4 = new Complex(-2, -4);
        number5 = new Complex(0, 0);
    }

    @Test
    public void testMinus1() {
        Complex difference = new Complex(9, 3);
        Assert.assertEquals(difference, number1.minus(number2));
    }

    @Test
    public void testMinus2() {
        Complex difference = new Complex(-1, 0);
        Assert.assertEquals(difference, number2.minus(number3));
    }

    @Test
    public void testMinus3() {
        Complex difference = new Complex(6, 12);
        Assert.assertEquals(difference, number3.minus(number4));
    }


    @Test
    public void testDivide1() {
        Complex quotient = new Complex(1.6986301369863013, -0.863013698630137);
        Assert.assertEquals(quotient, number1.divide(number2));
    }

    @Test
    public void testDivide2() {
        Complex quotient = new Complex(-2, 0);
        Assert.assertEquals(quotient, number3.divide(number4));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivide3() {
        Complex quotient = number4.divide(number5);
        Assert.fail();
    }
}
