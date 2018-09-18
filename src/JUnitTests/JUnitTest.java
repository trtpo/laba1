package JUnitTests;


import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.*;

public class JUnitTest {

    private Complex a = new Complex(-15,40);
    private Complex b = new Complex(120,240);
    private Complex c = new Complex(2,1);
    private Complex d = new Complex(0,0);

    @Test
    public void TestSub_on_negative_num() throws Exception {
        Complex result = a.minus(b);
        assertTrue("Your problem with calculations of real part of the number in function minus()",result.getReal() == -135.0);
        assertTrue("Your problem with calculations of imaginary part of the number in function minus()",result.getImage() == -200.0);
    }
    @Test
    public void TestSub_on_usual_num() throws Exception {
        Complex result = a.minus(c);
        assertTrue("Your problem with calculations of real part of the number in function minus()",result.getReal() == -17.0);
        assertTrue("Your problem with calculations of imaginary part of the number in function minus()",result.getImage() == 39.0);
    }
    @Test
    public void TestSub_on_zero_num() throws Exception {
        Complex result = a.minus(a);
        assertTrue("Your problem with calculations of real part of the number in function minus()",result.getReal() == 0.0);
        assertTrue("Your problem with calculations of imaginary part of the number in function minus()",result.getImage() == 0.0);
    }

    @Test
    public void TestSub_on_positive_num() throws Exception {
        Complex result = b.minus(d);
        assertTrue("Your problem with calculations of real part of the number in function minus()",result.getReal() == 120.0);
        assertTrue("Your problem with calculations of imaginary part of the number in function minus()",result.getImage() == 240.0);
    }

    @Test
    public void TestDiv_on_zero() throws Exception {
        Complex result = a.division(a);
        assertTrue("Your problem with calculations of real part of the number in function division()",result.getReal() == 1.0);
        assertTrue("Your problem with calculations of imaginary part of the number in function division()",result.getImage() == 0.0);
    }
    @Test
    public void TestDiv_usual() throws Exception {
        Complex result = a.division(c);
        assertTrue("Your problem with calculations of real part of the number in function division()",result.getReal() == 2.0);
        assertTrue("Your problem with calculations of imaginary part of the number in function division()",result.getImage() == 19.0);
    }
    @Test
    public void TestDiv_on_both_zero() throws Exception {
        Complex result = d.division(a);
        assertTrue("Your problem with calculations of real part of the number in function division()",result.getReal() == 0.0);
        assertTrue("Your problem with calculations of imaginary part of the number in function division()",result.getImage() == 0.0);
    }

}