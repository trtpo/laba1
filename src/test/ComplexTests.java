package test;
import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ComplexTests {
    @Test
    void minus() {
        Complex x = new Complex(2, 1);
        Complex y = new Complex(1, 2);
        Assert.assertEquals(new Complex(1, -1), x.subtract(y));
    }

    @Test
    void abs(){
        Complex a = new Complex(1, 2);
        Assertion.asserEquals(a.abs(), Math.hypot(1,2));
    }
}