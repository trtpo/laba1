package demo.parallel.test;

import demo.parallel.Complex;
import org.junit.Test;

public class MainTest {
    @Test
    public void test(){
        Complex complex = new Complex(10, 10);
        complex = complex.minus(new Complex(5, 5));
        assert complex.getRe() == 5 && complex.getIm() == 5;
    }
}
