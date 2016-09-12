/**
 * Created by Вадим on 12.09.2016.
 */
package demo.parallel;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.ArithmeticException;
import static org.junit.Assert.*;

public class ComplexTest {

    Complex a;
    Complex b;
    Complex c;
    Complex d;
    Complex result;



    @Before

    public void setUp() throws Exception {
        System.out.println("Setuping tests...");
        this.a = new Complex(1, 2);
        this.b = new Complex(15, 10);
        this.c = new Complex(3, 6);
        this.d = new Complex(0, 0);
        this.result = new Complex(0, 0);

    }


    @After
    public void cleanUp() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.result = null;
    }


    @Test
    public void plus() throws Exception {
        System.out.println("Perform Plus");
        result = a.plus(b);
        assertEquals(16, result.getRe(), 0);
        assertEquals(12, result.getIm(), 0);
    }


    @Test
    public void plusNull() throws Exception {
        System.out.print("Perform Plus Null");
        result.plus(b);
        assertEquals(15, result.getRe(), 0);
        assertEquals(10, result.getIm(), 0);
    }


    @Test

    public void minus() throws Exception {
        System.out.println("Perform Minus");
        result = a.minus(b);
        assertEquals(-14, result.getRe(), 0);
        assertEquals(-8, result.getIm(), 0);
    }


    @Test
    public void minusNull() throws Exception {
        System.out.println("Perform Minus Null");
        result = a.minus(d);
        assertEquals(1, result.getRe(), 0);
        assertEquals(2, result.getIm(), 0);
    }


    @Test

    public void divRight() throws Exception {
        System.out.println("Perform Division");
        result = b.div(c);
        assertEquals((double)7/3, result.getRe(), 0.0001);
        assertEquals((double)-4/3, result.getIm(), 0.0001);
    }


    @Test(expected = Exception.class)

    public void divNull() throws Exception {
        System.out.println("Perform Division by Null");
        result = b.div(d);
    }
}
