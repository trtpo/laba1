package demo.parallel;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void divided() {
        Complex expected = new Complex(-5, 12);
        Complex actual = (new Complex(85, 134)).divided(new Complex(7, -10));
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void trig() {
        Complex expected = new Complex(0, 1);
        Complex actual = (new Complex(3.14159265, 3.14159265)).trig();
        Assert.assertEquals(expected, actual);
    }
}