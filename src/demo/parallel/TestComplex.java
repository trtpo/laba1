package demo.parallel;
import org.junit.Assert;
import org.junit.Test;

public class TestComplex {
    @Test
    public void testPlus1()  {
        Complex elem1 =new Complex(2,4);
        Complex elem2 =new Complex(4,9);
        Complex result=new Complex(6,13);
        elem1.plus(elem2);
        Assert.assertEquals(result.getIm(),elem1.getIm(),0.0);
        Assert.assertEquals(result.getRe(),elem1.getRe(),0.0);
    }
    @Test
    public void testPlus2()
    {
        Complex elem1 =new Complex(5.9,4.7);
        Complex elem2 =new Complex(4.4,9.7);
        Complex result=new Complex(10.3,14.4);
        elem1.plus(elem2);
        Assert.assertEquals(result.getIm(),elem1.getIm(),0.0000001);
        Assert.assertEquals(result.getRe(),elem1.getRe(),0.0000001);
    }

    @Test
    public void testSub1()
    {
        Complex elem1 =new Complex(2,4);
        Complex elem2 =new Complex(4,9);
        Complex result=new Complex(-2,-5);
        elem1.sub(elem2);
        Assert.assertEquals(result.getIm(),elem1.getIm(),0.0);
        Assert.assertEquals(result.getRe(),elem1.getRe(),0.0);
    }

    @Test
    public void testSub2()
    {
        Complex elem1 =new Complex(2.6,4.1);
        Complex elem2 =new Complex(4.4,9.6);
        Complex result=new Complex(-1.8,-5.5);
        elem1.sub(elem2);
        Assert.assertEquals(result.getIm(),elem1.getIm(),0.00000001);
        Assert.assertEquals(result.getRe(),elem1.getRe(),0.00000001);
    }

    @Test
    public void testTimes1()
    {
        Complex elem1 =new Complex(2,4);
        Complex elem2 =new Complex(4,9);
        Complex result=new Complex(-28,34);
        elem1.times(elem2);
        Assert.assertEquals(result.getIm(),elem1.getIm(),0.0);
        Assert.assertEquals(result.getRe(),elem1.getRe(),0.0);
    }

    @Test
    public void testTimes2()
    {
        Complex elem1 =new Complex(2.2,4.7);
        Complex elem2 =new Complex(4.5,9.8);
        Complex result=new Complex(-36.16,42.71);
        elem1.times(elem2);
        Assert.assertEquals(result.getIm(),elem1.getIm(),0.0000001);
        Assert.assertEquals(result.getRe(),elem1.getRe(),0.0000001);
    }

    @Test
    public void testDiv1()
    {
        Complex elem1 =new Complex(2,4);
        Complex elem2 =new Complex(4,9);
        double real=(double)44/97;
        double imag=(double)(-2)/97;
        Complex result=new Complex(real,imag);
        elem1.div(elem2);
        Assert.assertEquals(result.getIm(),elem1.getIm(),0.00001);
        Assert.assertEquals(result.getRe(),elem1.getRe(),0.00001);
    }

    @Test
    public void testDiv2()
    {
        Complex elem1 =new Complex(4,1);
        Complex elem2 =new Complex(7,5);
        double real=(double)33/74;
        double imag=(double)(-13)/74;
        Complex result=new Complex(real,imag);
        elem1.div(elem2);
        Assert.assertEquals(result.getIm(),elem1.getIm(),0.00001);
        Assert.assertEquals(result.getRe(),elem1.getRe(),0.00001);
    }
}
