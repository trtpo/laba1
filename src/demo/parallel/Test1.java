package demo.parallel;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test1 {
    private Complex number;

    @Before
    public void setUp() throws Exception {

        number = new Complex(2, 4);
    }
 @Test
    public void minus() throws Exception {
     number.multiply(new Complex(5, 2));
     assertEquals(8, number.getRe(), 1e-15);
     assertEquals(10, number.getIm(), 1e-15);
 }
}
