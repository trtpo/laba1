import demo.parallel.Complex;
import org.junit.Assert;

    public class TestComplex extends Assert {
    @org.junit.Test
    public void FirstSubtractionTest() throws Exception {
        Complex comp = new Complex(5, 7);
        assertTrue(new Complex(2, 3).equal(comp.subtraction(new Complex(3, 4))));
    }
    @org.junit.Test
    public void SecondSubtractionTest() throws Exception {
        Complex comp = new Complex(4, 7);
        assertTrue(new Complex(1, -1).equal(comp.subtraction(new Complex(3, 8))));
    }
    @org.junit.Test
    public void FirstDivisionTest() throws Exception {
        Complex comp = new Complex(5, 7);
        assertTrue(new Complex(2.2, 1.6).equal(comp.div(new Complex(3, 1))));
    }
    @org.junit.Test
    public void SecondDivisionTest() throws Exception {
        Complex comp = new Complex(5, -7);
        assertTrue(new Complex((0.8), (-2.6)).equal(comp.div(new Complex(3, 1))));
    }
    @org.junit.Test(expected = ArithmeticException.class)
    public void ThirdDivisionTest() throws Exception {
        Complex comp = new Complex(5, 6);
        comp.div(new Complex(0, 0));
        assertEquals("Fuction: div(Complex). Invalid value", 0, comp.getReal(), 0);
        assertEquals("Fuction: div(Complex). Invalid value", 0, comp.getImag(), 0);
    }
}