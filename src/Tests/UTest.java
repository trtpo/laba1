package Tests;


import demo.parallel.Complex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UTest {

    @Test
    public void minus() {
        Complex complex1 = new Complex(10, 11);
        Complex complex2 = new Complex(9, 8);
        Complex complex3 = new Complex(1, 3);
        Assertions.assertEquals(complex1.minus(complex2), complex3);
    }

    @Test
    public void plus() {
        Complex complex1 = new Complex(1, 2);
        Complex complex2 = new Complex(3, 4);
        Complex complex3 = new Complex(4, 6);
        Assertions.assertEquals(complex1.plus(complex2), complex3);
    }
}
