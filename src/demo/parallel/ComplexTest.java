package demo.parallel;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ComplexTest {

    @Test
    public void subtraction() {
        Complex result = new Complex(5,5).subtraction(new Complex(1,2));
        assertEquals((long)result.getRe(), 4);
        assertEquals((long)result.getIm(), 3);
    }

    @Test
    public void division() {
        Complex result = new Complex(5,6).division(new Complex(1,1));
        double Re = 5.5;
        double Im = 0.5;
        assertEquals(result.getRe(), Re, 0.0001);
        assertEquals(result.getIm(), Im, 0.0001);
    }
}
