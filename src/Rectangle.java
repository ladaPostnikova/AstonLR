public class Rectangle implements figureImage {
    double sideA;
    double sideB;
    String fillColor;
    String borderColor;

    public Rectangle (double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public double perimeterOfFigures() {
        return 2 * (sideA + sideB);
    }

    @Override
    public double areaOfFigures() {
        return sideA * sideB;
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
        System.out.println("Периметр прямоуголика: " + perimeterOfFigures());
        System.out.println("Площадь прямоугольника: " + areaOfFigures());
        System.out.println("Цвет фона прямоугольника: " + fillColor);
        System.out.println("Цвет границ прямоугольника: " + borderColor);
    }
}
