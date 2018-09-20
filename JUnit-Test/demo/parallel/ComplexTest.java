package demo.parallel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ComplexTest {
    @Test
    public void TestMinusPositive() {
        String Error1 = "Error TestMinusPositive";
        Complex a= new Complex(5,3);
        Complex b = new Complex(2,2);
        a.minus(b);
        assertEquals(Error1,a.getRe(),3,0);
        assertEquals(Error1,a.getIm(),1,0);
    }

    @Test
    public void TestMinusNegative() {
        String Error2 = "Error TestMinusNegative ";
        Complex a = new Complex(-10, -1);
        Complex b = new Complex(-5, -3);
        a.minus(b);
        assertEquals(Error2,a.getRe(),-5,0);
        assertEquals(Error2,a.getIm(),2,0);
    }

    @Test
    public void TestMinus() {
        String Error3 = "Error TestMinus";
        Complex a = new Complex(1.231233112123123, 4124.2);
        Complex b = new Complex(1.231233112123123, 4124.2);
        a.minus(b);
        assertEquals(Error3,a.getRe(),0,0);
        assertEquals(Error3,a.getIm(),0,0);
    }

}