package Test;

import demo.parallel.Complex;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;


public class ComplexTest  {
    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Test
    public void minus() {
        double realA = 4.8;
        double imageA =6.9;
        double realB = 5.8;
        double imageB = 9.4;

        Complex minuend = new Complex(realA,imageA);
        Complex subtrahend = new Complex(realB,imageB);
        Complex result = new Complex(realA - realB, imageA - imageB);

        minuend.minus(subtrahend);

        collector.checkThat(
                "Subtraction operation test. Wrong result.",
                minuend.equal(result),
                equalTo(true)
        );

    }


    @Test
    public void isNaNTest(){

        Complex a = new Complex(0,0);

        collector.checkThat(
                "Wrong result, expected no NaN",
                a.isNaN(),
                equalTo(false)
        );
    }

    @Test
    public void division() {

        double realA = 7.8;
        double imageA = 9.9;
        double realB = 1.8;
        double imageB = 3.4;


        Complex divider = new Complex(realA,imageA);
        Complex dividend = new Complex(realB,imageB);
        Complex result = new Complex((realA * realB + imageA * imageB)/(realA * realB + imageA * imageB),
                (realB * imageA - realA * imageB)/(realA * realB + imageA * imageB));

        divider.division(dividend);

        collector.checkThat(
                "Division operation test. Wrong result.",
                divider.equal(result),
                equalTo(true)
        );
    }




    @Test
    public void divideByZero() {


        Complex divider = new Complex(7.8,-9.9);
        Complex dividend = new Complex(0,0);
        Complex result = divider.division(dividend);

        collector.checkThat(
                "Wrong result, expected Nan",
                result.isNaN(),
                equalTo(true)
        );
    }
}