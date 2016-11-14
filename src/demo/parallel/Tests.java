package demo.parallel;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Pash on 24.10.2016.
 */
public class Tests {

    private Complex number;

    @Before
    public void setUp() throws Exception {
        number = new Complex(4, 6);
    }

    @Test
    public void modulus() throws Exception {
        double modulus = number.modulus();
        double rightValue = Math.sqrt(Math.pow(number.getRe(), 2) + Math.pow(number.getIm(), 2));
        assertEquals("Not equal to correct value", rightValue, modulus, 1e-15);
    }

    @Test
    public void minus() throws Exception {
        number.minus(new Complex(3, 5));
        assertEquals("Should be equals to 1", 1, number.getRe(), 1e-15);
        assertEquals("Should be equals to 1", 1, number.getIm(), 1e-15);
    }

    @Test
    public void plus() throws Exception {
        number.plus(new Complex(3, 5));
        assertEquals("Should be equals to 7", 7, number.getRe(), 1e-15);
    }

}
