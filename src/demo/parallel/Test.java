package demo.parallel;
import static org.junit.Assert.*;

public class Test {

    Complex c;

    @org.junit.Before
    public void setUp() {
        c = new Complex(1, 1);
    }

    @org.junit.Test
    public void divTest() {
        assertTrue(c.divide(c).equals(new Complex(1,0)));
    }

    @org.junit.Test
    public void calcTest() {
        assertTrue(c.sub(c).equals(new Complex(0,0)));
    }

    @org.junit.Test
    public void baseTest() {
        assertTrue(new Complex(0,1).equals(new Complex(0,1)));
    }

}