import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class NumbersTest {
    @BeforeClass
    public void init() {
        System.out.println("Начало тестирования математических операций");
    }

    @Test (priority = 1)
    public void factorialTests() {
        assertEquals(FactorialNumbers.factorialNumbers(5), 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class, priority = 2)
    public void negativeFactorialTest() {
        FactorialNumbers.factorialNumbers(-1);
    }

    @Test(dataProvider = "triangleData", priority = 3)
    public void triangleAreaTest(int a, int b, double expected) {
        assertEquals(AreaOfTriangle.areaOfTriangle(a, b), expected);
    }

    @DataProvider
    public Object[][] triangleData() {
        return new Object[][]{
                {3, 4, 6.0},
                {5, 6, 15.0},
                {0, 4, 0.0}
        };
    }

    @Test(groups = "arithmetic", priority = 4)
    public void calculatorTests() {
        assertEquals(CalculatorNumber.add(2, 3), 5);
        assertEquals(CalculatorNumber.subtract(5, 3), 2);
        assertEquals(CalculatorNumber.division(10, 2), 5.0);
        assertEquals(CalculatorNumber.multiplication(2, 4), 8);
    }

    @Test(groups = "arithmetic", expectedExceptions = ArithmeticException.class, priority = 5)
    public void divisionByZeroTest() {
        CalculatorNumber.division(5, 0);
    }

    @Test(priority = 6)
    public void numbersEqualTest() {
        assertEquals(ComparisonOfNumbers.comparisonOfNumbers(5, 5), "Числа равны");
    }

    @Test(dependsOnMethods = "numbersEqualTest", priority = 7)
    public void numbersComparisonTests() {
        assertEquals(ComparisonOfNumbers.comparisonOfNumbers(6, 5), "Первое число больше");
        assertEquals(ComparisonOfNumbers.comparisonOfNumbers(4, 7), "Второе число больше");
    }


    @AfterClass
    public void finish() {
        System.out.println("Тестирование завершено");
    }
}