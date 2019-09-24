package test.parallel;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {
    public static double[][] dataSetDivide() {
        return new double[][] { { 2, 5, 1, 1, 3.5, 1.5}, { -2, 4, 6, -2.5, -0.52, 0.45 },
                { 3, 2.6, -9, 0, -0.33, -0.29 }, { 0, 0, 4, 7, 0, 0 }, {1, 1, 0, 0, 1, 1} };
    }

    @ParameterizedTest
    @MethodSource("dataSetDivide")
    void divide(double[] dataSetDivide) {
        Complex testNum1 = new Complex(dataSetDivide[0], dataSetDivide[1]);
        Complex testNum2 = new Complex(dataSetDivide[2], dataSetDivide[3]);
        Complex res = testNum1.divide(testNum2);
        Complex expectedResult = new Complex(dataSetDivide[4], dataSetDivide[5]);
        assertEquals(res, expectedResult, "Something get wrong, check divide method");
    }

    public static double[][] dataSetMinus() {
        return new double[][] { { 2, 5, 1, 1, 1, 4}, { -2, 4, 6, -2.5, -8, 1.5 },
                { 3, 2.6, -9, 0, 12, 2.6 }, { 0, 0, 4, 7, -4, -7 }, {1, 1, 0, 0, 1, 1} };
    }

    @ParameterizedTest
    @MethodSource("dataSetMinus")
    void minus(double[] dataSetMinus) {
        Complex testNum1 = new Complex(dataSetMinus[0], dataSetMinus[1]);
        Complex testNum2 = new Complex(dataSetMinus[2], dataSetMinus[3]);
        Complex res = testNum1.minus(testNum2);
        Complex expectedResult = new Complex(dataSetMinus[4], dataSetMinus[5]);
        assertEquals(res, expectedResult, "Something get wrong, check minus method");
    }
}