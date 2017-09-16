package demo.parallel.test;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
import static demo.parallel.test.TestUtils.*;

public class ComplexTrigonometryTest {
    private List<ComplexTrigonometryTestCase> testSuite;

    @Before
    public void initializeParameters() {
        testSuite = new LinkedList<>();
        testSuite.add(
                new ComplexTrigonometryTestCase(
                        new Complex(0, 0),
                        new Complex(0, 0),
                        new Complex(1, 0),
                        new Complex(0, 0)
                )
        );
        testSuite.add(
                new ComplexTrigonometryTestCase(
                        new Complex(2, 2),
                        new Complex(3.42, -1.51),
                        new Complex(-1.56, -3.29),
                        new Complex(-0.02, 1.02)
                )
        );
        testSuite.add(
                new ComplexTrigonometryTestCase(
                        new Complex(6, -4),
                        new Complex(-7.63, -26.2),
                        new Complex(26.22, -7.62),
                        new Complex(0, -0.99)
                )
        );
    }

    @Test
    public void testComplexSin() {
        for (ComplexTrigonometryTestCase testCase: testSuite) {
            Complex sin = testCase.getValue().getSin();
            assertTrue(
                    "sin(" + testCase.value + ") = " + sin + "(expected " + testCase.sinValue + ")",
                    testCase.testSin(sin)
            );
        }
    }

    @Test
    public void testComplexCos() {
        for (ComplexTrigonometryTestCase testCase: testSuite) {
            Complex cos = testCase.getValue().getCos();
            assertTrue(
                    "cos(" + testCase.value + ") = " + cos + "(expected " + testCase.cosValue + ")",
                    testCase.testCos(cos)
            );
        }
    }

    @Test
    public void testComplexTg() {
        for (ComplexTrigonometryTestCase testCase: testSuite) {
            Complex tg = testCase.getValue().getTg();
            assertTrue(
                    "tg(" + testCase.value + ") = " + tg + "(expected " + testCase.tgValue + ")",
                    testCase.testTg(tg)
            );
        }
    }

    private class ComplexTrigonometryTestCase {
        private Complex value;
        private Complex sinValue;
        private Complex cosValue;
        private Complex tgValue;

        public final double APPROXIMATION = 0.01d;

        public ComplexTrigonometryTestCase(Complex value,
                                           Complex sinValue,
                                           Complex cosValue,
                                           Complex tgValue) {
            this.value = value;
            this.sinValue = sinValue;
            this.cosValue = cosValue;
            this.tgValue= tgValue;
        }

        public boolean testSin(Complex sin) {
            return testRange(this.sinValue, sin);
        }

        public boolean testCos(Complex cos) {
            return testRange(this.cosValue, cos);
        }

        public boolean testTg(Complex tg) {
            return testRange(this.tgValue, tg);
        }

        public Complex getValue() {
            return value;
        }

    }
}
