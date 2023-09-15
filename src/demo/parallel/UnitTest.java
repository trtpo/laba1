package demo.parallel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class UnitTest {
    @Nested
    @DisplayName("Tests for the Complex.times(double k) operation")
    class TimesTest {
        @Test
        @DisplayName("Return test")
        void returnTest() {
            Complex number = new Complex(5, 10);
            Complex result = number.times(new Complex(15, 20));
            Assertions.assertEquals(number, result);
        }
        @Nested
        @DisplayName("Tests for the Complex.lazyPower(long n) operation")
        class LazyPowerTest {
        }
    }
}
