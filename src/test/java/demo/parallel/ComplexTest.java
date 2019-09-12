package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    // precision of double comparison
    private static final double PRECISION = 0.000000001;

    /**
     * Test if absoluteValue is correct with default (non zero) cases
     */
    @Test
    void absoluteValueTestDefault() {
        double[] absoluteValues = new double[] {
            new Complex(1, 1).absoluteValue(),
            new Complex(1, -1).absoluteValue(),
            new Complex(-1, 1).absoluteValue(),
            new Complex(-1, -1).absoluteValue()
        };

        final double ROOT_OF_TWO = Math.sqrt(2);
        double[] correctResults = new double[] {
            ROOT_OF_TWO,
            ROOT_OF_TWO,
            ROOT_OF_TWO,
            ROOT_OF_TWO
        };

        assertArrayEquals(absoluteValues, correctResults, PRECISION);
    }

    /**
     * Test if absolute value is correct with zero cases
     */
    @Test
    void absoluteValueTestAnyZeroes() {
        double[] absoluteValues = new double[] {
            new Complex(0, 0).absoluteValue(),
            new Complex(0, 1).absoluteValue(),
            new Complex(0, -1).absoluteValue(),
            new Complex(-1, 0).absoluteValue(),
            new Complex(-1, 0).absoluteValue()
        };

        double[] correctResults = new double[] {
            0,
            1,
            1,
            1,
            1
        };

        assertArrayEquals(absoluteValues, correctResults, PRECISION);
    }

    /**
     * Test if absoluteValue is correct with very big (nan infinity) cases
     */
    @Test
    void absoluteValueTestInfinities() {
        // check two infinities case
        double[] absoluteValuesTwoInfinities = new double[] {
            new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).absoluteValue(),
            new Complex(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY).absoluteValue(),
            new Complex(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY).absoluteValue(),
            new Complex(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY).absoluteValue()
        };

        double[] correctResultsTwoInfinities = new double[] {
            Double.POSITIVE_INFINITY,
            Double.POSITIVE_INFINITY,
            Double.POSITIVE_INFINITY,
            Double.POSITIVE_INFINITY
        };

        assertEquals(
                new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).absoluteValue(),
                Double.POSITIVE_INFINITY,
                PRECISION
        );

        assertArrayEquals(absoluteValuesTwoInfinities, correctResultsTwoInfinities, PRECISION);

        // check one infinity case
        double[] absoluteValuesOneInfinity = new double[] {
            new Complex(Double.POSITIVE_INFINITY, 0).absoluteValue(),
            new Complex(Double.POSITIVE_INFINITY, 1).absoluteValue(),
            new Complex(Double.POSITIVE_INFINITY, -1).absoluteValue(),
            new Complex(Double.NEGATIVE_INFINITY, 0).absoluteValue(),
            new Complex(Double.NEGATIVE_INFINITY, 1).absoluteValue(),
            new Complex(Double.NEGATIVE_INFINITY, -1).absoluteValue(),
            new Complex(0, Double.POSITIVE_INFINITY).absoluteValue(),
            new Complex(1, Double.POSITIVE_INFINITY).absoluteValue(),
            new Complex(-1, Double.POSITIVE_INFINITY).absoluteValue(),
            new Complex(0, Double.NEGATIVE_INFINITY).absoluteValue(),
            new Complex(1, Double.NEGATIVE_INFINITY).absoluteValue(),
            new Complex(-1, Double.NEGATIVE_INFINITY).absoluteValue()
        };

        double[] correctResultsOneInfinity = new double [] {
            Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY,
            Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY,
            Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY,
            Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY,
            Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY,
            Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY
        };


        assertArrayEquals(absoluteValuesOneInfinity, correctResultsOneInfinity, PRECISION);
    }


    /**
     * Test if sine is correct with default cases
     */
    @Test
    void sinTestDefault() {
        Complex number = new Complex(1, 1);

        assertEquals(Complex.sin(number), new Complex(1.29845758, 0.634963915));
    }

    /**
     * Test if sine is correct with null cases
     */
    @Test
    void sinTestNull() {
        assertThrows(ComplexNullPointerException.class, () -> Complex.sin(null));
    }

    /**
     * Test if sine is correct with very big (nan infinity) cases
     */
    @Test
    void sinTestInfinities() {
        Complex number = new Complex(Double.POSITIVE_INFINITY, 1);

        assertEquals(Complex.sin(number), new Complex(Double.NaN, Double.NaN));
    }

    /**
     * Test if cosine is correct with default cases
     */
    @Test
    void cosTestDefault() {
        Complex number = new Complex(1, 1);

        assertEquals(Complex.cos(number), new Complex(0.833730025, -0.988897706));
    }

    /**
     * Test if cosine is correct with null cases
     */
    @Test
    void cosTestNull() {
        assertThrows(ComplexNullPointerException.class, () -> Complex.cos(null));
    }

    /**
     * Test if sine is correct with very big (nan infinity) cases
     */
    @Test
    void cosTestInfinities() {
        Complex number = new Complex(Double.POSITIVE_INFINITY, 1);

        assertEquals(Complex.sin(number), new Complex(Double.NaN, Double.NaN));
    }

    @Test
    void subtractTestNull() {
        Complex number = new Complex(1, 1);

        assertThrows(ComplexNullPointerException.class, () -> number.subtract(null));
    }

    @Test
    void subtractTestDefault() {
        Complex[] firstNumbers = new Complex[] {
            new Complex(0, 0),
            new Complex(0, 1),
            new Complex(0, -1),
        };

        Complex[] secondNumbers = new Complex[] {
                new Complex(0, 0),
                new Complex(1, 1),
                new Complex(2, -1),
        };

        Complex[] resultsNumbers = new Complex[] {
                new Complex(0, 0),
                new Complex(-1, 0),
                new Complex(-2, 0),
        };

        for (int index = 0; index < 3; index++) {
            assertEquals(firstNumbers[index].subtract(secondNumbers[index]), resultsNumbers[index]);
        }
    }
}

