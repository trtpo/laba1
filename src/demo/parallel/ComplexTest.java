package demo.parallel;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ComplexTest {

    @Test
    public void powFunctionTest() {
        Complex tester = new Complex(45,3); // MyClass is tested
        tester.pow(0);
        assertEquals(tester.getIm(),0, "Im((45+i3)^0) must be 0");
        assertEquals(tester.getRe(),1, "Re((45+i3)^0) must be 1");
        tester = new Complex(3.5, -9.3);
        tester.pow(3);
        assertEquals(tester.getIm(),462.582, "Im((3.5-i9.3)^3) must be 462.582");
        assertEquals(tester.getRe(),-865.27, "Re((3.5-i9.3)^3) must be -865.27");
        tester = new Complex(-2, 6);
        tester.pow(-2);
        assertEquals(tester.getIm(),0.015, "Im((-2+i6)^-2) must be 0.015");
        assertEquals(tester.getRe(),-0.02, "Re((-2+i6)^-2) must be -0.02");
    }
}
