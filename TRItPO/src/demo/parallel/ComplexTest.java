package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    private static final double DELTA = 1e-15;

    @Test
    public void plus() {
        Complex myNumber = new Complex(12,3);
        Complex tested = new Complex(24, 6);
        assertEquals(tested.getReal(), myNumber.plus(myNumber).getReal(), DELTA);
    }

    @Test
    public void minus() {
        Complex myNumber = new Complex(24,6);
        Complex tested = new Complex(12, 3);
        assertEquals(tested.getReal(), myNumber.minus(tested).getReal(), DELTA);
    }

}