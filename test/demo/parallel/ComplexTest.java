package demo.parallel;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import java.util.stream.Stream;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @ParameterizedTest
    @ArgumentsSource(ComplexForMinusArgumentsProvider.class)
    void minusTest(Complex a, Complex b, Complex expectedResult) {
        Complex actualResult = a.minus(b);
        assertEquals(expectedResult, actualResult);
    }

    static public class ComplexForMinusArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(new Complex(2, -1), new Complex(1, 1),
                            new Complex(1, -2)),
                    Arguments.of(new Complex(1, 2), new Complex(3, 4),
                            new Complex(-2, -2)),
                    Arguments.of(new Complex(1, -9.36), new Complex(2, 4.96),
                            new Complex(-1, -14.32))
            );
        }
    }

    @ParameterizedTest
    @ArgumentsSource(ComplexForDivideArgumentsProvider.class)
    void divideTest(Complex a, Complex b, Complex expectedResult) {
        Complex actualResult = a.divide(b);
        assertEquals(expectedResult, actualResult);
    }

    static public class ComplexForDivideArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(new Complex(2, -1), new Complex(1, 1),
                            new Complex(0.5, -1.5)),
                    Arguments.of(new Complex(1, -2), new Complex(2, -1),
                            new Complex(0.8, -0.6)),
                    Arguments.of(new Complex(1, -2), new Complex(0, 0),
                            new Complex(NaN, NaN))
            );
        }
    }

}