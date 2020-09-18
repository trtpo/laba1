package src.demo.parallel;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTests {
    @Test
    public void minus() throws Exception {
        demo.parallel.Complex num = new demo.parallel.Complex(4,8);
        assertTrue(new demo.parallel.Complex(2,3).equals(num.minus(new demo.parallel.Complex(2,5))));
    }

    @Test
    public void divide() throws Exception {
        demo.parallel.Complex num = new demo.parallel.Complex(4,8);
        assertTrue(new demo.parallel.Complex(4,8).equals(num.divide(new demo.parallel.Complex(0,0))));
    }
}
