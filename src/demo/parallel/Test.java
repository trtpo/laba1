package demo.parallel;
import static org.junit.Assert.*;

public class Test {
    @org.junit.Test
    public void calcTest() {
        Complex c = new Complex(0, 0);
        assertTrue(c.div(new Complex(0,1)).equals(new Complex(0,0)));
    }
    @org.junit.Test
    public void baseTest() {
        assertTrue(new Complex(0,1).equals(new Complex(0,1)));
    }

}