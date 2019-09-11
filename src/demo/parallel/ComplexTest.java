package demo.parallel;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest extends Assert {

    @Test
    public void firstDivTest() {
        Complex comp = new Complex(4,7);
        assertTrue(new Complex(1.9, 1.7).equal(comp.div(new Complex(3, 1))));
    }

    @Test
    public void secondDivTest() {
        Complex comp = new Complex(5,8);
        assertTrue(new Complex(2.3, 1.9).equal(comp.div(new Complex(3, 1))));
    }

    @org.junit.Test
    public void firstSubtractionTest() {
        Complex comp = new Complex(5, 7);
        assertTrue(new Complex(2, 3).equal(comp.subtraction(new Complex(3, 4))));
    }

    @org.junit.Test
    public void secondSubtractionTest() {
        Complex comp = new Complex(4, 9);
        assertTrue(new Complex(1, 1).equal(comp.subtraction(new Complex(3, 8))));
    }
}
