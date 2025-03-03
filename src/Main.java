public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        circle.backgroundColor("Синий");
        circle.borderColor("Розовый");
        circle.outputFigure();
        System.out.println();

        Triangle triangle = new Triangle(5,6,7);
        triangle.backgroundColor("Красный");
        triangle.borderColor("Белый");
        triangle.outputFigure();
        System.out.println();

        Rectangle rectangle = new Rectangle(6,7);
        rectangle.backgroundColor("Фиолетовый");
        rectangle.borderColor("Зеленый");
        rectangle.outputFigure();
    }
}