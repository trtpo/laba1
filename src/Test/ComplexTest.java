package Test;

import demo.parallel.Complex;

import static org.junit.Assert.*;

public class ComplexTest {

    @org.junit.Test
    public void minus() throws Exception {
        double reA = 5.5;
        double imA = 6.7;
        double reB = 1.3;
        double imB = 2.2;
        Complex a = new Complex(reA,imA);
        Complex b = new Complex(reB,imB);
        Complex res = new Complex(reA - reB, imA - imB);
        assertTrue("Test minus() is failed",res.equalsTo(a.minus(b)));
    }

    @org.junit.Test
    public void sin() throws Exception {
        double reA = 5.5;
        double imA = 6.7;
        Complex a = new Complex(reA,imA);
        Complex res = new Complex(Math.sin(reA) * Math.cosh(imA), Math.cos(reA) * Math.sinh(imA));
        assertTrue("Test sin() is failed", res.equalsTo(a.sin()));
    }

    @org.junit.Test
    public void cos() throws Exception {
        double reA = 5.5;
        double imA = 6.7;
        Complex a = new Complex(reA,imA);
        Complex res = new Complex(Math.cos(reA) * Math.cosh(imA), -Math.sin(reA) * Math.sinh(imA));
        assertTrue("Test cos() is failed", res.equalsTo(a.cos()));
    }


    @org.junit.Test
    public void div() throws Exception {
        double reA = 5.5;
        double imA = 6.7;
        double reB = 1.3;
        double imB = 2.2;
        double d = reA * reB + imA * imB;
        Complex a = new Complex(reA,imA);
        Complex b = new Complex(reB,imB);
        Complex res = new Complex((reA * reB + imA * imB)/d, (reB * imA - reA * imB)/d);
        assertTrue("Test div() is failed", res.equalsTo(a.div(b)));
    }
}