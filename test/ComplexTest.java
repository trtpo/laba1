import demo.parallel.Complex;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Rule
    public  ExpectedException thrown = ExpectedException.none();

    @org.junit.jupiter.api.Test
    void checkMinus() {
        assertTrue(new Complex(10.3,2.1).minus(new Complex(7.9,-4)).equals(new Complex(2.4,6.1)),
                "Test for simple subtraction.");
    }

    @org.junit.jupiter.api.Test
    void checkDivide() {

        final Complex numberToTest_1 = new Complex(5.6,12.4);
        final Complex numberToTest_2 = new Complex(4.7,-11.1);
        final Complex numberToTest_3 = new Complex(-4.9,0);
        final Complex numberToTest_4 = new Complex(0,-1.70);
        final Complex numberToTest_5 = new Complex(0,0);

        assertTrue(numberToTest_1.clone().divide(numberToTest_2.clone()).equals(new Complex(-(double)5566/7265, (double)6022/7265)),
                "Test for division of complex number with not null re and im.");
        assertTrue(numberToTest_1.clone().divide(numberToTest_3.clone()).equals(new Complex(-(double)8/7, -(double)124/49)),
                "Test for division by number with im = 0.");
        assertTrue(numberToTest_2.clone().divide(numberToTest_4.clone()).equals(new Complex((double)111/17, (double)47/17)),
                "Test for division by number with re = 0.");
        assertTrue(numberToTest_3.clone().divide(numberToTest_1.clone()).equals(new Complex(-(double)343/2314,(double)1519/4628)),
                "Test for division number with im = 0.");
        assertTrue(numberToTest_4.clone().divide(numberToTest_1 ).equals(new Complex(-(double)527/4628,-(double)119/2314)),
                "Test for division number with re = 0.");

        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("Error!Division by 0.");
        numberToTest_1.divide(numberToTest_5);
    }

    @org.junit.jupiter.api.Test
    void checkGetCos() {
        assertTrue(new Complex(Math.PI /6,0).getCos().equals(new Complex(Math.sqrt(3)/2,0)),
                "Test for calculating cos(z) with arg = PI/6");
        assertTrue(new Complex(2*Math.PI/3 ,0).getCos().equals(new Complex(-0.5,0)),
                "Test for calculating cos(z) with arg =2PI/3");
    }

    @org.junit.jupiter.api.Test
    void checkPow() {
        final Complex numberToTest_1 = new Complex(5.6,12.4);
        final Complex numberToTest_2 = new Complex(-5.6,-12.4);
        final Complex numberToTest_3 = new Complex(5.6,-12.4);
        final Complex numberToTest_4 = new Complex(0,0);

        assertTrue(numberToTest_1.pow(4).equals(new Complex(-4305.8944,-33997.8240)), "Test for degree 4.");
        assertTrue(numberToTest_2.pow(3).equals(new Complex(2407.552,740.032)),"Test for degree 3.");
        assertTrue(numberToTest_3.pow(0).equals(new Complex(1,0)), "Test for degree 0.");

        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("Error!Division by 0.");
        numberToTest_4.pow(1);
    }
}