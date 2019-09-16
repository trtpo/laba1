package demo.parallel;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
class ComplexTest {

    @org.junit.jupiter.api.Test
    void divide() {
        Complex  testNumber1 = new Complex(1,2);
        Complex testNumber2 = new Complex(3,4);
        Complex result = new Complex(0,0);
        result = testNumber1.divide(testNumber2);
        result.pr();
        Complex expectedResult = new Complex(0.44,0.08);
        assertEquals(result, expectedResult);
    }

    @Test
    public void ComplexDivisionZeroTest()
    {
            Complex testNumber1 = new Complex(0, 0);
            Complex testNumber2 = new Complex(0, 0);
            double divRe=testNumber2.getReal();
            double divImg=testNumber2.getImg();
            if (divRe==0 || divImg==0)
            {
                System.out.println("Divide by zero");
            }
            else {System.out.println("Correct");}

    }

    @Test
    public void ComplexMinusTest()
    {
        Complex  testNumber1 = new Complex(1,2);
        Complex testNumber2 = new Complex(3,4);
        Complex result = new Complex(0,0);
        result = testNumber1.minus(testNumber2);
        result.pr();
        Complex expectedResult = new Complex(-2,-2);
        assertEquals(result, expectedResult);
    }

    @Test
    public void ComplexMinusResultZeroTest()
    {
        Complex  testNumber1 = new Complex(1,2);
        Complex testNumber2 = new Complex(1,2);
        Complex result = new Complex(0,0);
        result = testNumber1.minus(testNumber2);
        result.pr();
        Complex expectedResult = new Complex(0,0);
        assertEquals(result, expectedResult);
    }

}
