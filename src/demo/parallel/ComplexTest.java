package demo.parallel;

import org.junit.Test;

public class ComplexTest {

    @Test
    public void complexMinusTest(){
        Complex c = new Complex(3, 3);
        c = c.minus(c);
        assert c.getIm() == 0 && c.getRe() == 0;
    }
}
