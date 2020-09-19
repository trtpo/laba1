package demo.parallel;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {
    private Complex a;
    private Complex b;
    private Complex result;

    @Before
    public void initialize() {
        this.a = new Complex(2, -1);
        this.b = new Complex(1, 1);
    }

    @org.junit.Test
    public void complexDivision() {
        result = a.complexDivision(b);
        Assert.assertEquals(0.5, result.getRealPart(),0);
        Assert.assertEquals(-1.5, result.getImaginaryPart(),0);
    }

    @org.junit.Test
    public void multiply() {
        this.result = a.multiply(2);
        Assert.assertEquals(4, result.getRealPart(),0);
        Assert.assertEquals(-2, result.getImaginaryPart(),0);
    }

    @org.junit.Test
    public void divide() {
        this.result = a.divide(2);
        Assert.assertEquals(1, result.getRealPart(),0);
        Assert.assertEquals(-0.5, result.getImaginaryPart(),0);
    }
}