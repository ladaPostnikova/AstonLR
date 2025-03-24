public class FactorialNumbers {
    public static int factorialNumbers(int number) {
        int result = 1;
        if (number < 0) {
            System.out.println("Невозможно найти факториал отрицательного числа");
            throw new IllegalArgumentException();

        } else if (number == 0 || number == 1) {
            System.out.println("Результат: " + result);
            return result;
        } else {
                for (int i = 2; i <= number; i++) {
                    result *= i;
                }
        }

        System.out.println("Результат: " + result);

        return result;

    }
}
