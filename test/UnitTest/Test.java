package UnitTest;

import demo.parallel.Complex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class Test {

    private Complex x;
    private Complex y;

    @BeforeEach
    void InitComplex() {
        x = new Complex(10, 5);
        y = new Complex(1, 2);
    }

    @org.junit.jupiter.api.Test
    public void minus_test() {
        Complex z =             x.minus(y);
        Assertions.assertEquals(x.getRe() - y.getRe(), z.getRe());
        Assertions.assertEquals(x.getIm() - y.getIm(), z.getIm());
    }

}