package demo.parallel;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Roman Stelchenko 450501 on 05.09.2016.
 */
public class ComplexTest {

    private Complex complex;

    @org.junit.Before
    public void setUp() {
        complex = new Complex(7,5);
    }
    @org.junit.Test
    public void sin() throws Exception {
        complex = complex.sin(complex);
        assertEquals("sin error , Real do not match",48.75494167239679,complex.getReal());
        assertEquals("sin error , Image do not match",55.94196773410589,complex.getIm());
    }
    @org.junit.Test
    public void times() throws Exception {
        complex = complex.times(complex);
        assertEquals("times error , Real do not match",24.0,complex.getReal());
        assertEquals("times error , Image do not match",70.0,complex.getIm());
    }

    @org.junit.Test
    public void reDiv() throws Exception {
        complex = complex.reDiv(complex,3.5);
        assertEquals("reDiv error , Real do not match",2.0,complex.getReal());
        assertEquals("reDiv error , Image do not match",5.0,complex.getIm());
    }
    

}