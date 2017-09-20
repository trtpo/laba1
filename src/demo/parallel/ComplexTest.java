package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lenovo on 20.09.2017.
 */
public class ComplexTest {
    @org.junit.Test
    public void minus() {
        double reA = 5.5;
        double imA = 6.7;
        double reB = 1.3;
        double imB = 2.2;
        Complex a = new Complex(reA,imA);
        Complex b = new Complex(reB,imB);
        Complex res = new Complex(reA - reB,imA - imB);
        assertTrue(res.equalsTo(a.minus(b)));
    }

    @Test
    public void sin() {
        double reA = 5.5;
        double imA = 6.7;
        Complex a = new Complex(reA,imA);
        Complex res = new Complex(Math.sin(reA) * Math.cosh(imA),Math.cos(reA) * Math.sinh(imA));
        assertTrue(res.equalsTo(a.sin()));
    }

    @Test
    public void cos() throws Exception {
        double reA = 51.52;
        double imA = 62.73;
        Complex a = new Complex(reA,imA);
        Complex res = new Complex(Math.cos(reA) * Math.cosh(imA),-Math.sin(reA) * Math.sinh(imA));
        assertTrue(res.equalsTo(a.cos()));
    }

}