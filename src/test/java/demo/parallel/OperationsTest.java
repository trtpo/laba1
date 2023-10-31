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
        void returnTest(){
            Complex number = new Complex(1, 2);
            Complex result = number.times(new Complex(3, 4));
            Assertions.assertEquals(number, result);
        }

        @Test
        @DisplayName("Zero multiply")
        void zeroTest(){
            Complex actual = new Complex(1, 2).times(new Complex(0,0));
            Complex expect = new Complex(0, 0);
            Assertions.assertTrue(actual.equals(expect));
        }

        @Test
        @DisplayName("Neutral multiply")
        void neutralTest(){
            Complex actual = new Complex(1, 2).times(new Complex(1,0));
            Complex expect = new Complex(1, 2);
            Assertions.assertTrue(actual.equals(expect));
        }

        @Test
        @DisplayName("First ordinary multiply")
        void ordinaryTest1(){
            Complex actual = new Complex(1, 2).times(new Complex(2, 0));
            Complex expect = new Complex(2, 4);
            Assertions.assertTrue(actual.equals(expect));
        }

        @Test
        @DisplayName("Second ordinary multiply")
        void ordinaryTest2(){
            Complex actual = new Complex(1, 2).times(new Complex(-2, 0));
            Complex expect = new Complex(-2, -4);
            Assertions.assertTrue(actual.equals(expect));
        }
    }

    @Nested
    @DisplayName("Tests for the Complex.divide operation")
    class LazyPowerTest {
        @Test
        @DisplayName("Neutral divide")
        void neutralTest(){
            Complex actual = new Complex(4, 2).divide(new Complex(1, 0));
            Complex expect = new Complex(4, 2);
            Assertions.assertTrue(actual.equals(expect));
        }

        @Test
        @DisplayName("Random divide")
        void ordinaryTest1(){
            Complex actual = new Complex(4, 2).divide(new Complex(2, 0));
            Complex expect = new Complex(2, 1);
            Assertions.assertTrue(actual.equals(expect));
        }
    }
}