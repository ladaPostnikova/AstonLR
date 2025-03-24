import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NumbersTest {

    @BeforeAll
    static void init() {
        System.out.println("Начало тестирования");
    }

    @Test
    @DisplayName("Тест вычисления факториала")
    void testFactorial() {
        assertEquals(1, FactorialNumbers.factorialNumbers(0));
        assertEquals(120, FactorialNumbers.factorialNumbers(5));
    }

    @Test
    @DisplayName("Тест отрицательного факториала")
    void testNegativeFactorial() {
        Exception ex = assertThrows(
                IllegalArgumentException.class,
                () -> FactorialNumbers.factorialNumbers(-1)
        );
    }

    @ParameterizedTest
    @MethodSource("triangleDataProvider")
    @DisplayName("Параметризованный тест площади треугольника")
    void testTriangleArea(int a, int b, double expected) {
        assertEquals(expected, AreaOfTriangle.areaOfTriangle(a, b));
    }

    private static Stream<Arguments> triangleDataProvider() {
        return Stream.of(
                Arguments.of(3, 4, 6.0),    // Валидные данные
                Arguments.of(5, 6, 15.0),
                Arguments.of(0, 4, 0.0),     // Невалидные данные → ожидаем 0
                Arguments.of(-3, 4, 0.0)     // Отрицательные → тоже 0
        );
    }

    @Test
    @DisplayName("Тест сложения")
    void testAddition() {
        assertEquals(5, CalculatorNumber.add(2, 3));
    }

    @Test
    @DisplayName("Тест вычитания")
    void testSubtraction() {
        assertEquals(2, CalculatorNumber.subtract(5, 3));
    }

    @Test
    @DisplayName("Тест умножения")
    void testMultiplication() {
        assertEquals(8, CalculatorNumber.multiplication(2, 4));
    }

    @Test
    @DisplayName("Тест деления")
    void testDivision() {
        assertEquals(5.0, CalculatorNumber.division(10, 2));
    }

    @Test
    @DisplayName("Тест деления на ноль")
    void testDivisionByZero() {
        Exception ex = assertThrows(
                ArithmeticException.class,
                () -> CalculatorNumber.division(5, 0)
        );
        assertEquals("Деление на ноль", ex.getMessage());
    }

    @Test
    @DisplayName("Тест сравнения равных чисел")
    void testEqualNumbers() {
        assertEquals("Числа равны", ComparisonOfNumbers.comparisonOfNumbers(5, 5));
    }

    @Test
    @DisplayName("Тест когда первое число больше")
    void testFirstNumberGreater() {
        assertEquals("Первое число больше", ComparisonOfNumbers.comparisonOfNumbers(6, 5));
    }

    @Test
    @DisplayName("Тест когда второе число больше")
    void testSecondNumberGreater() {
        assertEquals("Второе число больше", ComparisonOfNumbers.comparisonOfNumbers(4, 7));
    }

    @AfterAll
    static void tearDown() {
        System.out.println("Тестирование завершено");
    }

}