package demo.parallel;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    private Complex a;
    private Complex b;


    @BeforeEach
    void setUp() {
        a = new Complex(5, 3);
        b = new Complex(6, -1);
    }

    @Test
    void minus() {
        a.minus(b);
        Assert.assertEquals("Subtraction error(real part)", -1, a.getRe(), 0);
        Assert.assertEquals("Subtraction error(imaginary part)", 4, a.getIm(), 0);
    }

    @Test
    void division() {
        a.division(b);
        Assert.assertEquals("Division error(real part)", 0.72, a.getRe(), 0.01);
        Assert.assertEquals("Division error(imaginary part)", 0.50, a.getIm(), 0.01);
    }
}

