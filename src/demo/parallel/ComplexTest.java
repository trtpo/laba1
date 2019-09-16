package demo.parallel;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class ComplexTest {
    @Test
    public void test_minus() {
        Complex result = new Complex(1, 1).minus(new Complex(2, 2));
        assertEquals(result.getRe(), -1.0);
        assertEquals(result.getIm(), -1.0);
        result = new Complex(-1, -1).minus(new Complex(-2, -2));
        assertEquals(result.getRe(), 1.0);
        assertEquals(result.getIm(), 1.0);
  }
}
