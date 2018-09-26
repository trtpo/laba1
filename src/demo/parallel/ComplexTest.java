package demo.parallel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Test-class for methods from  class "Complex"
 * */
public class ComplexTest {
    /** Value of the first test object Complex. */
    private static Complex checkComplex1;
    /** Value of the second test object Complex. */
    private static Complex checkComplex2;
    /** Value of the object Complex. */
    private static Complex complex1;
    /** Value of the object Complex. */
    private Complex complex2;
    /**
     * Initialize values
     * {@inheritDoc}
     * */
    @BeforeClass
    public static void initialize() {
        checkComplex1 = new Complex(2, 1.5);
        checkComplex2 = new Complex(1.5, 0.25);
        complex1 = new Complex(2, 4);
    }
    /**
     * {@inheritDoc}
     * */
    @Before
    public void initializeComplex() {
        complex2 = new Complex(4, 5.5);
    }
    /**
     * Test for method division(Complex).
     * {@inheritDoc}
     * */
    @Test
    public void testDivision() {
        Assert.assertEquals(checkComplex2, complex2.division(complex1));
    }
    /**
     * Test for method subtraction(Complex).
     * {@inheritDoc}
     * */
    @Test
    public void testSubtraction() {
        Assert.assertEquals(checkComplex1, complex2.subtraction(complex1));
    }
}