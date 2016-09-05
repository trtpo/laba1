package demo.parallel;

import static junit.framework.TestCase.assertEquals;
/**
 * Created by Andrei Domasevich 450501 on 05.09.2016.
 */
public class ComplexTest {

    private Complex complex, complex1;

    @org.junit.Before
    public void setUp() {
        complex = new Complex(5,4);
        complex1 = new Complex(9,0);
    }
    @org.junit.Test
    public void cos() throws Exception {
        complex  = complex.cos(complex);
        assertEquals(7.7463130074030735,complex.getRe());
        assertEquals(26.168964053872834,complex.getIm());
    }

    @org.junit.Test
    public void sin() throws Exception {
        complex1 = complex1.sin(complex1);
        assertEquals(0.4121184852417566,complex1.getRe());
        assertEquals(-0.0,complex1.getIm());
    }

}