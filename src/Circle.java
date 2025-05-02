public class Circle implements figureImage {
    double radius;
    String fillColor;
    String borderColor;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double perimeterOfFigures() {
        return radius * 2 * Math.PI;
    }

    @Override
    public double areaOfFigures() {
        return radius * radius * Math.PI;
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
        System.out.println("Периметр круга: " + perimeterOfFigures());
        System.out.println("Площадь круга: " + areaOfFigures());
        System.out.println("Цвет фона круга: " + fillColor);
        System.out.println("Цвет границ круга: " + borderColor);
    }
}
