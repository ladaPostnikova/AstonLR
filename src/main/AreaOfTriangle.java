package main;

public class AreaOfTriangle {
    public static double areaOfTriange (int leg1, int leg2) {
        if (leg1 <= 0 || leg2 <= 0) {
            System.out.println("Длина катета не может быть отрицательным числом или равным 0!");
        }
        double result = (leg1 * leg2) / 2;
        System.out.println("Площадь тругольника: " + result);
        return result;
    }
}
