package demo.parallel.test;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
import static demo.parallel.test.TestUtils.*;

public class ComplexArithmeticTest {
    private List<ComplexArithmeticTestCase> testSuite;

    @Before
    public void initializeParameters() {
        testSuite = new LinkedList<>();
        testSuite.add(
                new ComplexArithmeticTestCase(
                        new Complex(0, 0),
                        new Complex(1, 3),
                        new Complex(0, 0)
                )
        );
        testSuite.add(
                new ComplexArithmeticTestCase(
                        new Complex(2, 3),
                        new Complex(4, 1),
                        new Complex(0.64, 0.58)
                )
        );
        testSuite.add(
                new ComplexArithmeticTestCase(
                        new Complex(5, 2),
                        new Complex(3, 2),
                        new Complex(1.46, -0.3)
                )
        );
    }

    @Test
    public void testDivision() {
        for (ComplexArithmeticTestCase testCase: testSuite) {
            Complex tmp = new Complex(testCase.a.getRe(), testCase.a.getIm());
            testCase.a.divide(testCase.b);
            assertTrue(
                    tmp + "/" + testCase.b + " = " + testCase.a
                            + "(expected " + testCase.divisionValue + ")",
                    testCase.testDivision(testCase.a)
            );
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroDivision() {
        new Complex(1, 1).divide(new Complex(0, 0));
    }

    private class ComplexArithmeticTestCase {
        private Complex a;
        private Complex b;
        private Complex divisionValue;

        public final double APPROXIMATION = 0.01d;

        public ComplexArithmeticTestCase(Complex a,
                                         Complex b,
                                         Complex divisionValue) {
            this.a = a;
            this.b = b;
            this.divisionValue = divisionValue;
        }

        public boolean testDivision(Complex divisionValue) {
            return testRange(this.divisionValue, divisionValue);
        }
    }
}
