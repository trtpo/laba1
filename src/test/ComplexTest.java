package test;
import demo.parallel.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ComplexTest {

    @Test
    void minus(){
        Complex a = new Complex(200, 100);
        a = a.minus(new Complex(100, 50));
        Assertions.assertEquals(a.getRe(), 100);
        Assertions.assertEquals(a.getIm(), 50);
    }

    @Test
    void div(){
        Complex a = new Complex(4, 8);
        a = a.div(new Complex(8, 6));
        Assertions.assertEquals(a.getRe(), 0.8);
        Assertions.assertEquals(a.getIm(), 0.4);
    }
}
