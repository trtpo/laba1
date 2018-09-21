package demo.parallel;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
public class UnitTest {
    private Complex a;
    private Complex b;
    @Before
    public void testSetup() throws Exception {
        a = new Complex(20, 16);
        b = new Complex(10, 7);
    }
    @Test
    public void plusTest() throws Exception {
        a.plus(b);
        assertEquals(" plus operation Re", 37, a.get_re(), 0.001);
        assertEquals(" plus operation Im", 20, a.get_im(), 0.001);
    }
    @Test
    public void minusTest() throws Exception {
        a.minus(b);
        assertEquals(" minus operation Re", 10, a.get_re(), 0.001);
        assertEquals(" minus operation Im", 6, a.get_im(), 0.001);
    }
}