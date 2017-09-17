package demo.parallel;
import static org.junit.Assert.*;

public class Tests {
    @org.junit.Test
    public void testMinus_1() throws Exception {
        Complex a = new Complex(4,8);
        Complex b = new Complex(1,1);
        assertTrue(a.minus(b).equalTo(new Complex(3,7)));
    }
    @org.junit.Test
    public void testMinus_2() throws Exception {
        Complex a = new Complex(17,-3);
        Complex b = new Complex(14,88);
        assertTrue(a.minus(b).equalTo(new Complex(3,-91)));
    }
    @org.junit.Test
    public void testMinus_3() throws Exception {
        Complex a = new Complex(-6,-66);
        Complex b = new Complex(3,34);
        assertTrue(a.minus(b).equalTo(new Complex(-9,-100)));

    }
    @org.junit.Test
    public void testMinus_4() throws Exception {
        Complex a = new Complex(17,3);
        Complex b = new Complex(-14,-1);
        assertTrue(a.minus(b).equalTo(new Complex(31,4)));
    }
    @org.junit.Test
    public void testMinus_5() throws Exception {
        Complex a = new Complex(-17,-3);
        Complex b = new Complex(-14,-1);
        assertTrue(a.minus(b).equalTo(new Complex(-3,-2)));
    }
    @org.junit.Test
    public void testDivide_1() throws Exception {
        Complex a = new Complex(11,10);
        Complex b = new Complex(7,5);
        assertTrue(a.divide(b).equalTo(new Complex(127d/74d, 15d/74d)));
    }

    @org.junit.Test
    public void testDivide_2() throws Exception {
        Complex a = new Complex(13,-5);
        Complex b = new Complex(12,7);
        assertTrue(a.divide(b).equalTo(new Complex(121d/193d, -151d/193d)));
    }

    @org.junit.Test
    public void testDivide_3() throws Exception {
        Complex a = new Complex(-2,13);
        Complex b = new Complex(1,2);
        assertTrue(a.divide(b).equalTo(new Complex(24d/5d, 17d/5d)));
    }
}
