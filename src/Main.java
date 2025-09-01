interface Shape {
    double calculateArea();
    double calculatePerimetr();
    double colorBorder();
    double colorBack();
    }

class Circle implements Shape {
    private double radius;
    private double colorBorderCircle;
    private double colorBackCircle;

    public Circle(double radius) {
        this.radius = radius;
        this.colorBorderCircle = colorBorderCircle;
        this.colorBackCircle = colorBackCircle;
    }
    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
    @Override
    public double calculatePerimetr() {
        return 3.14 * radius * 2;
    }
    @Override
    public double colorBack() {
        return 8017;
    }
    @Override
    public double colorBorder() {
        return 9010;
    }
}

class Triangle implements Shape {
    //принимаем, что треугольник равнобедренный
    private double maxside;
    private double height;
    public Triangle(double height, double maxside) {
        this.height = height;
        this.maxside = maxside;
    }
    @Override
    public double calculateArea() {
        return 0.5 * height * maxside;
    }
    @Override
    public double calculatePerimetr() {
        return Math.pow(((maxside/2)*(maxside/2)+(height/2)*(height/2)),0.5);
    }
    @Override
    public double colorBack() {
        return 8017;
    }
    @Override
    public double colorBorder() {
        return 9010;
    }
}

class Square implements Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public double calculateArea() {
        //принимаем прямоугольник = квадрат
        return side * side;
    }
    @Override
    public double calculatePerimetr() {
        return 4*side;
    }
    @Override
    public double colorBack() {
        return 8017;
    }
    @Override
    public double colorBorder() {
        return 9010;
    }
}
public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(3.0);
        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Периметр круга: " + circle.calculatePerimetr());
        System.out.println("Заливка круга (№RAL): " + circle.colorBack());
        System.out.println("Цвет границы круга (№RAL): " + circle.colorBorder());

        Shape triangle = new Triangle(2, 3);
        System.out.println("Площадь треугольника: " + triangle.calculateArea());
        System.out.println("Периметр треугольника: " + triangle.calculatePerimetr());
        System.out.println("Заливка треугольника (№RAL): " + triangle.colorBack());
        System.out.println("Цвет границы треугольника (№RAL): " + triangle.colorBorder());

        Shape square = new Square(2.0);
        System.out.println("Площадь квадрата: " + square.calculateArea());
        System.out.println("Периметр квадрата: " + square.calculatePerimetr());
        System.out.println("Заливка квадрата (№RAL): " + square.colorBack());
        System.out.println("Цвет границы квадрата (№RAL): " + square.colorBorder());
    }
}



