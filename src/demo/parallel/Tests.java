package demo.parallel;

import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {

    @Test
    public void minus_test1() {
        Complex first = new Complex(10, 99);
        Complex second = new Complex(5, 100);
        Complex actual = first.minus(second);
        Complex expected = new Complex(5, -1);

        assertEquals(expected.getReal(), actual.getReal(), 0);
        assertEquals(expected.getImage(), actual.getImage(), 0);
    }
}