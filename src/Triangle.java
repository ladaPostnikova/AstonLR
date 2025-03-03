public class Triangle implements figureImage {
    double sideA;
    double sideB;
    double sideC;
    String fillColor;
    String borderColor;

    public Triangle (double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double perimeterOfFigures() {
        return sideA + sideB + sideC;
    }

    @Override
    public double areaOfFigures() {
        double p = perimeterOfFigures() / 2;
        double h = 2 * Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC))  / sideA;
        return 0.5 * sideA * h;
    }

    @Override
    public void backgroundColor(String color) {
        this.fillColor = color;
    }

    @Override
    public void borderColor(String color) {
        this.borderColor = color;
    }

    @Override
    public void outputFigure() {
        System.out.println("Периметр треугольника: " + perimeterOfFigures());
        System.out.println("Площадь треугольника: " + areaOfFigures());
        System.out.println("Цвет заливки треугольника: " + fillColor);
        System.out.println("Цвет границ треугольника: " + borderColor);
    }
}
