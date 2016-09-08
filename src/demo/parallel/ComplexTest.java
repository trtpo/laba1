package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ulianko_victor on 07.09.2016.
 */
public class ComplexTest {

    Complex var_1;
    Complex var_2;
    Complex null_variable;
    Complex result;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
        this.var_1 = new Complex(15.0, 9.0);
        this.var_2 = new Complex(3.0, 1.0);
        this.null_variable = new Complex(0, 0);
        this.result = new Complex(0, 0);
    }

    @Test
    public void minus() throws Exception {
        System.out.println("Minus");
        result = var_1.minus(var_2);
        assertEquals(12, result.getRe(), 0);
        assertEquals(8, result.getIm(), 0);
    }

    @Test
    public void division() throws Exception {
        System.out.println("Division");
        result = var_1.division(var_2);
        assertEquals(5.4, result.getRe(), 0);
        assertEquals(1.2, result.getIm(), 0);
    }

    @Test(expected = Exception.class)
    public void divNull() throws Exception {
        System.out.println("Division by Null!");
        result = var_2.division(null_variable);
    }
}