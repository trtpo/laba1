package demo.parallel;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ComplexTest {
    @Test
    public void minusTest(){
        Complex a=new Complex(4.4,5.5);
        Complex b=new Complex(-3.4,6.7);

        Complex rez=a.minus(b);

        assertEquals(4.4-(-3.4),rez.getRe(),0.0001);
        assertEquals(5.5-6.7,rez.getIm(),0.0001);
    }

    @Test
    public void mulTest(){
        Complex a=new Complex(4.4,5.5);
        double argum = 0.3;
        Complex rez=a.offset(argum);

        assertEquals(4.4+0.3,rez.getRe(),0.0001);
        assertEquals(5.5+0.3,rez.getIm(),0.0001);
    }

}