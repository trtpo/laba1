package demo.parallel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ComplexTest {
    private Complex complexA;
    private Complex complexB;
    @Before
    public  void setComplexDelete()
    {

        complexA=new Complex(-1,3);
        complexB=new Complex(1,2);
    }
    @Test
    public void Test_delete() {
        Complex a = complexA.delete(complexB);
        assertEquals(a.getIm(), 1.0);
        assertEquals(a.getRe(), 1.0);
    }
    @Before
    public  void setComplexMinus()
    {

        complexA=new Complex(-1,3);
        complexB=new Complex(1,2);
    }

    @Test
    public void Test_minus() {
        Complex a = complexA.minus(complexB);
        assertEquals(a.getIm(), 1.0);
        assertEquals(a.getRe(), -2.0);
    }
}