package demo.parallel;

import org.junit.Test;

public class MinusTest {
    @Test
    public void minusTest(){
        Complex c1 = new Complex(1, 1);
        Complex c2 = new Complex(1, 1);
        c1.minus(c2);
        assert c1.getIm() == 0 && c1.getRe() == 0;
    }
}
