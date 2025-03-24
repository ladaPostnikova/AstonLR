import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NumbersTest {
    @Test
    void factorialNumbersTest() {
        assertEquals(FactorialNumbers.factorialNumbers(0), 1);
        assertEquals(FactorialNumbers.factorialNumbers(1), 1);
        assertEquals(FactorialNumbers.factorialNumbers(5), 120);
    }

    @Test
    void areaOfTriangleTest(){
        assertEquals(AreaOfTriangle.areaOfTriange(6,4),12);
    }

    @Test
    void calculatorAddTest(){
        assertEquals(CalculatorNumber.add(5,6), 11);
    }

    @Test
    void calculatorSubtractTest(){
        assertEquals(CalculatorNumber.subtract(10,5), 5);
    }

    @Test
    void calculatorDivisionTest(){
        assertEquals(CalculatorNumber.division(12,6), 2);
    }

    @Test
    void calculatorMultiplicationTest(){
        assertEquals(CalculatorNumber.multiplication(6,4), 24);
    }


    @Test
    void comparisonOfNumbersTest(){
        assertEquals("Числа равны", ComparisonOfNumbers.comparisonOfNumbers(5,5));
        assertEquals("Первое число больше", ComparisonOfNumbers.comparisonOfNumbers(6,5));
        assertEquals("Второе число больше", ComparisonOfNumbers.comparisonOfNumbers(5,6));
    }

}