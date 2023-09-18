package demo.parallel.test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    void powTest() {
        Complex a = new Complex(3, 5);
        Complex b = new Complex(3, 5);

        a.times(a).times(a);
        b.pow(b, 3);
        assert a.equals(b);
    }
}
