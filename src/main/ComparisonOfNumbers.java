package main;

public class ComparisonOfNumbers {
    public static String comparisonOfNumbers (int number1, int number2){
        String result = "Числа равны";
        if (number1 == number2) {
            result = "Числа равны";
        } else if (number1 > number2) {
            result = "Первое число больше";
        } else if (number1 < number2){
            result = "Второе число больше";
        }
        System.out.println(result);
        return result;
    }
}
