package demo.parallel;


import org.junit.Test;

import static org.junit.Assert.*;

public class JUnitTest {

    private Complex a = new Complex(-15,40);
    private Complex b = new Complex(120,240);
    private Complex c = new Complex(2,1);
    private Complex d = new Complex(0,0);

    @Test
    public void TestSub0() throws Exception {
        Complex result = a.minus(b);
        assertTrue(result.getReal() == -135.0);
        assertTrue(result.getImage() == -200.0);
    }
    @Test
    public void TestSub1() throws Exception {
        Complex result = a.minus(c);
        assertTrue(result.getReal() == -17.0);
        assertTrue(result.getImage() == 39.0);
    }
    @Test
    public void TestSub2() throws Exception {
        Complex result = a.minus(a);
        assertTrue(result.getReal() == 0.0);
        assertTrue(result.getImage() == 0.0);
    }

    @Test
    public void TestSub3() throws Exception {
        Complex result = b.minus(d);
        assertTrue(result.getReal() == 120.0);
        assertTrue(result.getImage() == 240.0);
    }

    @Test
    public void TestDiv0() throws Exception {
        Complex result = a.division(a);
        assertTrue(result.getReal() == 1.0);
        assertTrue(result.getImage() == 0.0);
    }
    @Test
    public void TestDiv1() throws Exception {
        Complex result = a.division(c);
        assertTrue(result.getReal() == 2.0);
        assertTrue(result.getImage() == 19.0);
    }
    @Test
    public void TestDiv2() throws Exception {
        Complex result = d.division(a);
        assertTrue(result.getReal() == 0.0);
        assertTrue(result.getImage() == 0.0);
    }

}