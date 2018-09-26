package demo.parallel;

import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;


import org.junit.Assert;

public class ComplexTest {

    private static Complex checkComplex1;
    private static Complex checkComplex2;
    private static Complex complex1;
    private Complex complex2;


    @BeforeClass
    public static void initialize() {
        checkComplex1 = new Complex(2, 1.5);
        checkComplex2 = new Complex(1.5, 0.25);
        complex1 = new Complex(2, 4);
    }




    @Before
    public void initializeComplex() {
        complex2 = new Complex(4, 5.5);
    }

    @Test
    public void not_division() {


        Assert.assertEquals(checkComplex2, complex2);

    }
    @Test
    public void division() {


        Assert.assertEquals(checkComplex2, complex2.division(complex1));

    }

    @Test
    public void subtraction() {
        Assert.assertEquals(checkComplex1, complex2.subtraction(complex1));
    }
}