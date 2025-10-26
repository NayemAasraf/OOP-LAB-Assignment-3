interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10.0, 5.0);
        Shape circ = new Circle(7.0);
        Shape tri = new Triangle(8.0, 4.0);

        System.out.println("Area of Rectangle: " + rect.getArea());
        System.out.println("Area of Circle: " + circ.getArea());
        System.out.println("Area of Triangle: " + tri.getArea());
    }
}