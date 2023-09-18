public class Main {
    public static void main(String[] args) {
        GeometryFigure figureBox = new GeometryFigure();
        Circle circle1 = new Circle(10, "Окружность1");
        Circle circle2 = new Circle(12, "Окружность2");
        Triangle triangle1 = new Triangle(12, 25, 17, "Треугольник1");
        Triangle triangle2 = new Triangle(14, 15, 16, "Треугольник2");
        Rectangle rectangle1 = new Rectangle(6, 10, "Прямоугольник1");
        Rectangle rectangle2 = new Rectangle(12, 12, "Квадрат1");
        
        figureBox.add(circle1);
        figureBox.add(circle2);
        figureBox.add(triangle1);
        figureBox.add(triangle2);
        figureBox.add(rectangle1);
        figureBox.add(rectangle2);

        figureBox.getInfo(0);
        figureBox.getInfo(1);
        figureBox.getInfo(2);
        figureBox.getInfo(3);
        figureBox.getInfo(4);
        figureBox.getInfo(5);
        figureBox.getInfo(6);

        figureBox.search(circle2);
        figureBox.search(rectangle1);

        figureBox.remove(6);
        figureBox.remove(5);

        figureBox.search(rectangle2);

    }
}