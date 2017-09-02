package demo.parallel;

import static org.junit.Assert.*;

public class ComplexTest {

    @org.junit.Test
    public void substr() throws Exception {
        Complex num = new Complex(2,3);
        assertTrue(new Complex(1,1).equals(num.substr(new Complex(1,2))));
    }

    @org.junit.Test
    public void substrTwo() throws Exception {
        Complex num = new Complex(10,46);
        assertTrue(new Complex(2,1).equals(num.substr(new Complex(8,45))));
    }

}