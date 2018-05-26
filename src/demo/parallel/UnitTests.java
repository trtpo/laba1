package demo.parallel;
import static org.junit.Assert.*;

public class UnitTests {
    @org.junit.Test
    public void Minustest1() throws Exception {
        Complex a = new Complex(4,8);
        Complex b = new Complex(1,1);
        assertTrue(a.minus(b).equalTo(new Complex(3,7)));
    }
    @org.junit.Test
    public void Minustest2() throws Exception {
        Complex a = new Complex(16,-7);
        Complex b = new Complex(13,84);
        assertTrue(a.minus(b).equalTo(new Complex(3,-91)));
    }
    @org.junit.Test
    public void Minustest3() throws Exception {
        Complex a = new Complex(-6, -66);
        Complex b = new Complex(3, 34);
        assertTrue(a.minus(b).equalTo(new Complex(-9, -100)));
    }
    @org.junit.Test
    public void Minustest4() throws Exception {
        Complex a = new Complex(17,3);
        Complex b = new Complex(-14,-1);
        assertTrue(a.minus(b).equalTo(new Complex(31,4)));
        }
    @org.junit.Test
    public void Minustest5() throws Exception {
        Complex a = new Complex(-17, -3);
        Complex b = new Complex(-14, -1);
        assertTrue(a.minus(b).equalTo(new Complex(-3, -2)));
    }
}