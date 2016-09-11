import demo.parallel.Complex;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ComplexTest {

    @Test
    public void testDivide() throws Exeption {
        Complex comp = new Complex(5,1);
        Complex trueRes = new Complex (1,0);
        Complex res = comp.divide(comp);

        assertEquals(res, trueRes);
    }

    @Test
    public void testMinus() throws Exeption {
        Complex comp = new Complex(5,1);
        Complex trueRes = new Complex (0,0);
        Complex res = comp.minus(comp);

        assertEquals(res, trueRes);
    }
}
