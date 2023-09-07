package demo.parallel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class OperationsTest {
    @Nested
    @DisplayName("Tests for the Complex.times(double k) operation")
    class TimesTest {
        // I don't understand at all why all operations modify left operand, but ok, let's check it out
        @Test
        @DisplayName("Return test")
        void returnTest(){
            Complex number = new Complex(1, 2);
            Complex result = number.times(new Complex(3, 4));
            Assertions.assertEquals(number, result);
        }

        @Test
        @DisplayName("Zero multiply")
        void zeroTest(){
            Complex actual = new Complex(1, 2).times(0);
            Complex expect = new Complex(0, 0);
            Assertions.assertTrue(actual.equals(expect));
        }

        @Test
        @DisplayName("Neutral multiply")
        void neutralTest(){
            Complex actual = new Complex(1, 2).times(1);
            Complex expect = new Complex(1, 2);
            Assertions.assertTrue(actual.equals(expect));
        }

        @Test
        @DisplayName("First ordinary multiply")
        void ordinaryTest1(){
            Complex actual = new Complex(1, 2).times(2);
            Complex expect = new Complex(2, 4);
            Assertions.assertTrue(actual.equals(expect));
        }

        @Test
        @DisplayName("Second ordinary multiply")
        void ordinaryTest2(){
            Complex actual = new Complex(1, 2).times(-2);
            Complex expect = new Complex(-2, -4);
            Assertions.assertTrue(actual.equals(expect));
        }
    }

    @Nested
    @DisplayName("Tests for the Complex.lazyPower(long n) operation")
    class LazyPowerTest {
        @Test
        @DisplayName("Zero power")
        void zeroTest(){
            Complex actual = new Complex(1, 2).lazyPower(0);
            Complex expect = new Complex(1, 0);
            Assertions.assertTrue(actual.equals(expect));
        }

        @Test
        @DisplayName("Neutral power")
        void neutralTest(){
            Complex actual = new Complex(1, 2).lazyPower(1);
            Complex expect = new Complex(1, 2);
            Assertions.assertTrue(actual.equals(expect));
        }

        @Test
        @DisplayName("Negative power")
        void negativeTest(){
            Assertions.assertThrows(
                    IllegalArgumentException.class,
                    ()-> new Complex(1, 2).lazyPower(-1),
                    "power should be a non-negative");
        }

        @Test
        @DisplayName("First ordinary power")
        void ordinaryTest1(){
            double re = 1;
            double im = 2;
            Complex actual = new Complex(re, im).lazyPower(2);
            Complex expect = new Complex(re, im).times(new Complex(re, im));
            Assertions.assertTrue(actual.equals(expect));
        }

        @Test
        @DisplayName("Second ordinary power")
        void ordinaryTest2(){
            double re = 1;
            double im = 2;
            Complex actual = new Complex(re, im).lazyPower(3);
            Complex expect = new Complex(re, im).times(new Complex(re, im)).times(new Complex(re, im));
            Assertions.assertTrue(actual.equals(expect));
        }

    }
}
