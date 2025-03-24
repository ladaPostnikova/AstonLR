public class AreaOfTriangle {
    public static double areaOfTriangle (int leg1, int leg2) {
        double result = 0;
        if (leg1 <= 0 || leg2 <= 0) {
            System.out.println("Длина катета не может быть отрицательным числом или равным 0!");
        } else {
            result = (leg1 * leg2) / 2;
            System.out.println("Площадь треугольника: " + result);
        }
        return result;
    }
}


