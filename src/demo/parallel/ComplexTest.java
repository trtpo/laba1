package parallel;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.jupiter.api.Test;



class ComplexTest {
    @Test
    public void testMinus() {
        Complex a = new Complex(3,8);
        Complex b = new Complex(1,4);
        Complex result = new Complex(2,4);
        a = a.minus(b);
        Assert.assertEquals(a.getRe(),result.getRe(),0.5);
        Assert.assertEquals(a.getIm(),result.getIm(),0.5);
    }

    @Test
    public void testSinComp() {
        Complex a = new Complex(1,2);
        Complex result = new Complex(3.1658,-3.6258);
        a = a.sinComp();
        Assert.assertEquals(Math.round(a.getRe()*10000d)/10000d,Math.round(result.getRe()*10000d)/10000d,0.5);
        Assert.assertEquals(Math.round(a.getIm()*10000d)/10000d,Math.round(result.getIm()*10000d)/10000d,0.5);
    }

}