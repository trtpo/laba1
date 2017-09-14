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
    Complex number;

    @Before
    public void settingUp() throws Exception {
        System.out.println("Setting up tests...");
        this.a = new Complex(7, 9);
        this.b = new Complex(5, 4);
        this.c = new Complex(1, 8);
        this.d = new Complex(0, 0);
        this.result = new Complex(0, 0);
        this.number = new Complex(1, 2);
    }

    @Test
    public void plus() throws Exception {
        System.out.println("Perform Plus");
        result = a.plus(b);
        assertEquals(12, result.getReal(), 0);
        assertEquals(13, result.getImage(), 0);
    }

    @Test
    public void minus() throws Exception {
        System.out.println("Perform Minus");
        result = a.minus(b);
        assertEquals(2, result.getReal(), 0);
        assertEquals(5, result.getImage(), 0);
    }

    @Test
    public void minusNull() throws Exception {
        System.out.println("Perform Minus Null");
        result = a.minus(d);
        assertEquals(7, result.getReal(), 0);
        assertEquals(9, result.getImage(), 0);
    }

    @Test(expected = Exception.class)
    public void divideNull() throws Exception {
        System.out.println("Perform Division by Null");
        result = b.division(d);
    }

    @Test
    public void minus2() throws Exception {
        number.minus(new Complex(2, 3));
        assertEquals(-1, number.getReal(), 0.0001);
        assertEquals(-1, number.getImage(), 0.0001);
    }

    @Test
    public void division() throws Exception {
        number.division(new Complex(2, 3));
        assertEquals((double) 8 / 13, number.getReal(), 0.00001);
        assertEquals((double) 1 / 13, number.getImage(), 0.00001);
    }
}