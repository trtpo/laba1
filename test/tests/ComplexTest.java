package tests;

//import org.junit.jupiter.api.Test;
import demo.parallel.Complex;
import org.junit.jupiter.api.*;
import demo.parallel.Complex.*;

class ComplexTest {

    @Test
    void multiply() {
        Complex test = new Complex(10, 10);
        Complex result = new Complex(100, 100);
        test = test.plus(test);
        assert (test == result);
    }

    @Test
    void division() {
        Complex test = new Complex(10, 10);
        Complex result = new Complex(1, 1);
        test = test.plus(test);
        assert (test == result);
    }

    @Test
    void minus() {
    }
}