package demo.parallel;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComplexTest {

    private Complex a;
    private Complex b;
    private Complex c;

    @BeforeEach
    void setUp() {
        a = new Complex(2, 9);
        b = new Complex(5, -8);
    }

    @Test
    public void testDivide() {
        a.divide(b);
        Assert.assertEquals("Error in division (real part)", -0.69, a.getReal(), 0.01);
        Assert.assertEquals("Error in division (imag part)", 0.44, a.getImag(), 0.01);
    }

    @Test
    public void testMinus() {
        a.minus(b);
        Assert.assertEquals("Error in subtraction (real part)", -3, a.getReal(), 0);
        Assert.assertEquals("Error in subtraction (img part)", 17, a.getImag(), 0);
    }
}