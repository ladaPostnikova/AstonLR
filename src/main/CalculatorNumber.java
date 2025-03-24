package main;

public class CalculatorNumber {
    public static int add(int number1, int number2) {
        int result = number1 + number2;
        System.out.println("Результат сложения: " + result);
        return result;
    }

    public static int subtract(int number1, int number2) {
        int result = number1 - number2;
        System.out.println("Результат вычитания: " + result);
        return result;
    }

    public static double division(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        double result = number1 / number2;
        System.out.println("Результат деления: " + result);
        return result;
    }

    public static int multiplication(int number1, int number2) {
        int result = number1 * number2;
        System.out.println("Результат умножения: " + result);
        return result;
    }

}
