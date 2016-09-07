package demo.parallel;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by nikit on 08.09.2016.
 */
public class JunitComplexTest {

    private Complex _complex;
    @Before
    public void setUp() throws Exception {
        _complex = new Complex(4,6);
    }
    @Test
    public void minus() throws Exception {
        _complex.minus(new Complex(2,4));
        assertEquals(1,_complex.getRe(),0.0001);
        assertEquals(2,_complex.getIm(),0.0001);
    }
    @Test
    public void division() throws Exception {
        _complex.division(new Complex(2,3));
        assertEquals(2,_complex.getRe(),0.1);
        assertEquals(0,_complex.getIm(),0.01);
    }
}
