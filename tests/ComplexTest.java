import demo.parallel.Complex;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class ComplexTest {
    @Test
    public void testMinus() {
        Complex a = new Complex(3,8);
        Complex b = new Complex(1,4);
        Complex result = new Complex(2,4);
        a = a.minus(b);
        Assert.assertEquals(a.getRe(),result.getRe());
        Assert.assertEquals(a.getIm(),result.getIm());
    }
    @Test
    public void testSinComp() {
        Complex a = new Complex(1,2);
        Complex result = new Complex(3.1658,-3.6258);
        a = a.sinComp();
        Assert.assertEquals(Math.round(a.getRe()*10000d)/10000d,Math.round(result.getRe()*10000d)/10000d);
        Assert.assertEquals(Math.round(a.getIm()*10000d)/10000d,Math.round(result.getIm()*10000d)/10000d);
    }
}
