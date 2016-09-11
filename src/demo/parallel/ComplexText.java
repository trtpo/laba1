package demo.parallel;

public class ComplexTest {

    @org.junit.Test
    public static void sin() throws Exception {
        Complex comp = new Complex(3, -1).sin();

        org.junit.Assert.assertEquals(0.21, comp.getRe(), 0.01);
        org.junit.Assert.assertEquals(1.16, comp.getIm(), 0.01);
    }

    @org.junit.Test
    public static void cos() throws Exception {
        Complex comp = new Complex(1, -1).cos();

        org.junit.Assert.assertEquals(0.83, comp.getRe(), 0.01);
        org.junit.Assert.assertEquals(0.98, comp.getIm(), 0.01);
    }

    @org.junit.Test
    public static void scale() throws Exception {
        Complex comp = new Complex(1, 1).scale(2);

        org.junit.Assert.assertEquals(2, comp.getRe(), 0.01);
        org.junit.Assert.assertEquals(2, comp.getIm(), 0.01);
    }

}