package test;
        import demo.parallel.Complex;
        import org.junit.Assert;
        import org.junit.Test;
        import org.junit.jupiter.api.Assertions;

        import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaTests {

    @Test
    public void testMinus() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(-1, 3);

        Complex expected_result = new Complex(2, -1);
        Complex actual_result = a.minus(b);

        Assert.assertEquals("(1,2)-(-1,3) must be equal to (2,-1)", expected_result, actual_result);
    }

    @Test
    public void testDivide() {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(1, 2);
        Complex expected = new Complex(1.6, -0.2);
        Complex actual = a.divide(b);
        Assert.assertEquals("(2,3).divide((1,2)) must be equal to (1.6,-0.2)",expected, actual);
    }
}