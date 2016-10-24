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
        number = new Complex(4, 3);
    }

    @Test
    public void minus() throws Exception {
        number.minus(new Complex(3, 5));
        assertEquals(1, number.getRe(), 1e-15);
        assertEquals(-2, number.getIm(), 1e-15);
    }

}
