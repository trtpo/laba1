package demo.parallel;
import static org.junit.Assert.*;
public class Test {
    @org.junit.Test
    public void Subtracttest1() throws Exception {
        Complex a = new Complex(4,8);
        Complex b = new Complex(1,1);
        assertTrue(a.subtract(b).equalsTo(new Complex(3,7)));
    }
    @org.junit.Test
    public void Subtracttest2() throws Exception {
        Complex a = new Complex(16,-7);
        Complex b = new Complex(13,84);
        assertTrue(a.subtract(b).equalsTo(new Complex(3,-91)));
    }
    @org.junit.Test
    public void Subtracttest3() throws Exception {
        Complex a = new Complex(-6,-66);
        Complex b = new Complex(3,34);
        assertTrue(a.subtract(b).equalsTo(new Complex(-9,-100)));
    }
    @org.junit.Test
    public void Inversiontest1() throws Exception {
        Complex a = new Complex(11,10);
        assertTrue(a.inversion().equalsTo(new Complex(-11, -10)));
    }
    @org.junit.Test
    public void Inversiontest2() throws Exception {
        Complex a = new Complex(13,-5);
        assertTrue(a.inversion().equalsTo(new Complex(-13,5)));
    }
}