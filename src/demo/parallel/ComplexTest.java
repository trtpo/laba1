package demo.parallel;


        import static org.junit.Assert.*;

public class ComplexTest {

    private static Complex checkComplex1;
    private static Complex checkComplex2;
    private static Complex complex1;
    private Complex complex2;


    public static void initialize() {
        checkComplex1 = new Complex(2, 1.5);
        checkComplex2 = new Complex(1.5, 0.25);
        complex1 = new Complex(2, 4);
    }


    public void initializeComplex() {
        complex2 = new Complex(4, 5.5);
    }

    @org.junit.Test
    public void division() {


        Assert.assertEquals(checkComplex2, complex2.division(complex1));

    }

    @org.junit.Test
    public void subtraction() {
        Assert.assertEquals(checkComplex1, complex2.subtraction(complex1));
    }
}