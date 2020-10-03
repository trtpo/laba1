package demo.parallel;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void sub() {
        Complex elem1 =new Complex(2,4);
        Complex elem2 =new Complex(4,9);
        Complex result=new Complex(-2,-5);
        elem1.sub(elem2);
        Assert.assertEquals(result.getIm(),elem1.getIm());
        Assert.assertEquals(result.getRe(),elem1.getRe());
    }

    @org.junit.jupiter.api.Test
    void div() {
        Complex elem1 =new Complex(2,4);
        Complex elem2 =new Complex(4,9);
        double real=(double)44/97;
        double imag=(double)(-2)/97;
        Complex result=new Complex(real,imag);
        elem1.div(elem2);
        Assert.assertEquals(result.getIm(),elem1.getIm());
        Assert.assertEquals(result.getRe(),elem1.getRe());
    }
}