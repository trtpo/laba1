package demo.parallel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.lang.ArithmeticException;  /////////////////

/**
 * Created by Irina on 07.09.2016.
 */
public class ComplexTest {

    Complex variable_1;
    Complex variable_2;
    Complex null_variable;
    Complex result;

    @Before
    public void setUp() throws Exception {
        System.out.println("Information before processing");
        this.variable_1 = new Complex(10.0, 8.0);
        this.variable_2 = new Complex(4.0, 2.0);
        this.null_variable = new Complex(0, 0);
        this.result = new Complex(0, 0);
    }

    @Test
    public void plus() throws Exception {
        System.out.println("Plus");
        result = variable_1.plus(variable_2);
        assertEquals(14, result.getRe(), 0);
        assertEquals(10, result.getIm(), 0);
    }

    @Test
    public void minus() throws Exception {
        System.out.println("Minus");
        result = variable_1.minus(variable_2);
        assertEquals(6, result.getRe(), 0);
        assertEquals(6, result.getIm(), 0);
    }

    @Test
    public void div() throws Exception {
        System.out.println("Division");
        result = variable_1.div(variable_2);
        assertEquals(2.8, result.getRe(), 0);
        assertEquals(0.6, result.getIm(), 0);
    }

    @Test(expected = Exception.class)
    public void divNull() throws Exception {
        System.out.println("Error! Division by Null is impossible!");
        result = variable_2.div(null_variable);
    }
}


