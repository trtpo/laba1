package demo.parallel;

import org.junit.jupiter.api.Nested;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class Test {

    @Nested
    class ComplexTest {

        @org.junit.jupiter.api.Test
        public void testMinus() {
            // Создаем комплексные числа для тестирования
            Complex a = new Complex(3, 5);
            Complex b = new Complex(1, 2);

            // Вызываем метод minus
            Complex result = a.minus(b);

            // Проверяем, что результат соответствует ожидаемым значениям
            assertEquals(2, result.getRe());
            assertEquals(7, result.getIm());

            // Проверяем, что метод возвращает ссылку на текущий объект
            assertSame(a, result);
        }

        @org.junit.jupiter.api.Test
        public void testDiv() {
            Complex a = new Complex(3, 5);
            Complex b = new Complex(1, 2);

            Complex result = a.div(b);

            assertEquals(0.5, result.getRe());
            assertEquals(6.5, result.getIm());

            assertSame(a, result);
        }

    }
}
