package tests;
import demo.parallel.Complex
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ComplexTest {
    private final double re = 20;
    private final double im = 10;
    @Test
    void abs(){
        Complex a = new Complex(re, im);
        Assertion.asserEquals(a.abs(), Math.hypot(re,im));
    }

    @Test
    void phase(){
        Complex a = new Complex(re, im);
        Assertion.asserEquals(a.phase(), Math.atan2(re,im));
    }
}