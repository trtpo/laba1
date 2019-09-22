package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    private Complex expected;
    private Complex actual;
    private Complex z1;
    private Complex z2;

    @Test
    public void sub() {
        System.out.println("sub");
        expected = new Complex(2, -40);
        actual = new Complex(0, 0);
        z1 = new Complex(17, -35);
        z2 = new Complex(15, 5);
        actual = z1.sub(z2);
        printResult();
    }

    @Test
    public void div() {
        System.out.println("div");
        expected = new Complex(-0.307, 1.461);
        actual = new Complex(0, 0);
        z1 = new Complex(2, 5);
        z2 = new Complex(3, -2);
        actual = z1.div(z2);
        printResult();
    }

    public void printResult() {
        System.out.println("Right answer : " + "re = " + expected.re() + " im =" + expected.im());
        System.out.println("Result : " + "re = " + actual.re() + " im =" + actual.im());
    }
}