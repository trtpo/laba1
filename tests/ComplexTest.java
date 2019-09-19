import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;

public class ComplexTest {
    @Test
    public void minus(){
        Complex a = new Complex(3,5);
        Complex b = new Complex(2,4);
        a = a.minus(b);
        Complex c = new Complex(a.getRe(),a.getIm());
        Assert.assertEquals(1.0, c.getRe(), 0.0);
        Assert.assertEquals(1.0, c.getRe(), 0.0);
    }

    @Test
    public void cos(){
        Complex a = new Complex(3,5);
        a = a.cos();
        Assert.assertEquals(-73.4673, Math.round(a.getRe()*10000d)/10000d, 0.0);
        Assert.assertEquals(-69.443, Math.round(a.getIm()*10000d)/10000d, 0.0);
    }

    @Test
    public void sin(){
        Complex a = new Complex(3,5);
        a = a.cos();
        Assert.assertEquals(-73.4673, Math.round(a.getRe()*10000d)/10000d, 0.0);
        Assert.assertEquals(-69.443, Math.round(a.getIm()*10000d)/10000d, 0.0);
    }
}
