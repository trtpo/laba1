import demo.parallel.Complex;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

class ComplexTest {

    @Test
    public void subtraction() {
        Complex result = new Complex(5,5).subtraction(new Complex(1,2));
        assertEquals(result, new Complex(4,3));
    }

    @Test
    public void division() {
        Complex result = new Complex(5,6).division(new Complex(1,1));
        assertEquals(result, new Complex(5.5,0.5));
    }
}