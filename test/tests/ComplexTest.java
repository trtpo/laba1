package tests;

//import org.junit.jupiter.api.Test;
import demo.parallel.Complex;
import org.junit.jupiter.api.*;
import demo.parallel.Complex.*;

class ComplexTest {

    @Test
    void multiply() {
        Complex test1 = new Complex(10, 10);
        Complex test2 = new Complex(10, 10);
        Complex result = new Complex(100, 100);
        test1 = test1.multiply(test2);
        assert (test1.getIm() == result.getIm());
        assert (test1.getRe() == result.getRe());
    }

    @Test
    void division() {
        Complex test = new Complex(10, 10);
        Complex result = new Complex(1, 1);
        test = test.division(test);
        assert (test.getIm() == result.getIm());
        assert (test.getRe() == result.getRe());
    }

    @Test
    void minus() {
        Complex test1 = new Complex(120, 110);
        Complex test2 = new Complex(10, 10);
        Complex result = new Complex(110, 100);
        test1 = test1.minus(test2);
        assert (test1.getIm() == result.getIm());
        assert (test1.getRe() == result.getRe());
    }
}