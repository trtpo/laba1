package demo.parallel;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    Complex num1;
    Complex num2;

    @org.junit.jupiter.api.BeforeEach
    public void setUp()  {
        num1 = new Complex(3,7);
        num2 = new Complex(2,5);
    }

    @org.junit.jupiter.api.Test
    void testSub() {
        Complex actual = num1.sub(num2);
        Complex expect = new Complex(1,2);
        Assertions.assertEquals(expect.getRe(), actual.getRe());
        Assertions.assertEquals(expect.getIm(), actual.getIm());
    }

    @org.junit.jupiter.api.Test
    void TestDiv() {
        Complex actual = num1.div(num2);
        Complex expect = new Complex(1.41379,-0.03448);
        double delta=0.00009;
        Assertions.assertEquals(expect.getRe(),actual.getRe(),delta);
        Assertions.assertEquals(expect.getIm(),actual.getIm(),  delta);
    }

}