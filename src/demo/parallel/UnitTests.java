package demo.parallel;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UnitTests {
    private FractalFunction fractalFunction = new FractalFunction();

    public void runUnitTests(){
        testPositiveNumbers();
        testNegativeNumbers();
        System.out.println("Unit tests succeeded");
    }

    @Test
    private void testNegativeNumbers() {
        assertEquals("(-1,-1)*(-1,-1) must be (0,16)",true,
                compareComplexObjects(new Complex(0, 16),fractalFunction.countFractalFunction(new Complex(-1, -1), new Complex(-1, -1))));
    }

    @Test
    private void testPositiveNumbers() {
        Complex a = fractalFunction.countFractalFunction(new Complex(1, 1), new Complex(1, 1));
        assertEquals("(1,1)*(1,1) must be (0, 16)", true,
                compareComplexObjects(new Complex(0, 16), fractalFunction.countFractalFunction(new Complex(1, 1), new Complex(1, 1))));
    }

    private boolean compareComplexObjects (Complex a, Complex b) {
        if(a.returnRealPart() == b.returnRealPart() &&
                a.returnImaginaryPart() == b.returnImaginaryPart())
            return true;
        return false;
    }
}
