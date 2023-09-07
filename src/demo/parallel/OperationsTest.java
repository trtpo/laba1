package demo.parallel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class OperationsTest {
    @Nested
    @DisplayName("Tests for the Complex.times(double k) operation")
    class TimesTest {
        @Test
        @DisplayName("Return test")
        void returnTest() {
            Complex number = new Complex(1, 2);
            Complex result = number.times(new Complex(3, 4));
            Assertions.assertEquals(number, result);
        }
        @Nested
        @DisplayName("Tests for the Complex.lazyPower(long n) operation")
        class LazyPowerTest {
        }
    }
}


