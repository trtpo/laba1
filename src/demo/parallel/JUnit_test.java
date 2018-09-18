package demo.parallel;
import static org.junit.Assert.*;


public class JUnit_test {
    @org.junit.Test
    public void minus() {
        Complex qwe = new Complex(10,20);
        qwe.minus(new Complex(5,10));
        assertEquals(qwe.getRe(),5,0);
        assertEquals(qwe.getIm(),10,0);
    }
}
