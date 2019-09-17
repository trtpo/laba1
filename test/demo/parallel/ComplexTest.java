package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*@RunWith(Arquillian.class)*/
public class ComplexTest {
    /*@Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Complex.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }*/

    @Test
    public void plus() {
        Complex a = new Complex(18, -6);
        Complex b = new Complex(3, 8);
        Complex result = a.plus(b);
        assertEquals(new Complex(21, 2), result);
    }

    @Test
    public void times() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(2, 4);
        Complex result = a.times(b);
        assertEquals(new Complex(-6, 8), result);
    }

    @Test
    public void minus() {
        Complex a = new Complex(18, 6);
        Complex b = new Complex(3, 8);
        Complex result = a.minus(b);
        assertEquals(new Complex(15, -2), result);
    }

    @Test
    public void division() {
        Complex a = new Complex(2, 4);
        Complex b = new Complex(1, 2);
        Complex result = a.division(b);
        assertEquals(new Complex(2, 0), result);
    }

    @Test
    public void sine() {
        Complex a = new Complex(1, 3);
        double real = Math.sin(a.Re()) * Math.cosh(a.Im());
        double imag = Math.cos(a.Re()) * Math.sinh(a.Im());
        Complex result = a.sine();
        assertEquals(real, result.Re(), 0);
        assertEquals(imag, result.Im(), 0);
    }

    @Test
    public void cosine() {
        Complex a = new Complex(1, 3);
        double real = Math.cos(a.Re()) * Math.cosh(a.Im());
        double imag = -Math.sin(a.Re()) * Math.sinh(a.Im());
        Complex result = a.cosine();
        assertEquals(real, result.Re(), 0);
        assertEquals(imag, result.Im(), 0);
    }

    @Test (expected = ArithmeticException.class)
    public void testDivisionByZero()
    {
        Complex a = new Complex(1,2);
        Complex b = new Complex(0,0);
        Complex result =a.division(b);
        Assert.fail();
    }
}
