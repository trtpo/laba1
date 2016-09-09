package demo.parallel;

/**
 * Created by Nikita on 10.09.2016.
 */
public class ComplexTest {

    @org.junit.Test
    public static void cos() throws Exception {
        Complex comp = new Complex(1, -1).cos();

        org.junit.Assert.assertEquals(0.83, comp.getRe(), 0.01);
        org.junit.Assert.assertEquals(0.98, comp.getIm(), 0.01);
    }
}
