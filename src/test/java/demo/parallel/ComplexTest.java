package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ComplexTest{

    @Test
    void fiveReFourImMinusTwoReOneImEqualsThreeReThreeIm() {
        Complex a = new Complex(5,4);
        Complex expected = new Complex(3,3);
        Complex result = a.minus(new Complex(2,1));
        assertEquals(expected, result);
    }

    @Test
    public void fourReTwoImTwoTimesRealEqualsEightReFourIm() {
        Complex a = new Complex(4,2);
        double numReal = 2;
        Complex expected = new Complex(8,4);
        assertEquals(expected, a.timesReal(numReal));
    }
}