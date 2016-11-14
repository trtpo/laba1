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
    public void times() throws Exception {
        number.times(new Complex(2, 3));
        assertEquals("Should return -8", -8, number.getRe(), 1e-15);
        assertEquals("Should return 16", 16, number.getIm(), 1e-15);
    }
}
