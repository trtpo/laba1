package Tests;

import demo.parallel.Complex;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ComplexTests {
    private Complex value1;
    private Complex value2;
    private Complex value3;


    @Before
    public void init(){
        value1 = new Complex(1,1);
        value2 = new Complex(4,5);
        value3 = new Complex(0,0);

    }

    @Test
    public void subComplex(){
        Complex res = value2.sub(value1);
        assertEquals(3, res.getRe(), 0);
        assertEquals(4, res.getIm(), 0);
        // assertEquals(9, res.getIm(), 0);
    }

    @Test
    public void divComplex(){
        Complex res = value2.div(value1);
        assertEquals(4.5, res.getRe(), 0);
        assertEquals(0.5, res.getIm(), 0);
    }

    @Test
    public void divComplexNull(){
        Complex res = value2.div(value3);
        assertEquals(4, res.getRe(), 0);
        assertEquals(5, res.getIm(), 0);
    }

    @Test
    public void sinComplex(){
        Complex res = value3.sin();
        assertEquals(0, res.getRe(), 0);
        assertEquals(0, res.getIm(), 0);

        Complex res2 = value1.sin();
        assertEquals(1.298, res2.getRe(), 3);
        assertEquals(0.316, res2.getIm(), 3);
    }


}
