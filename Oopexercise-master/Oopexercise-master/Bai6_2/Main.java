package Bai6_2;
public class Main {
    public static void main(String[] args) {
        // Testing Circle
        GeometricObject circle = new Circle(5.0);
        System.out.println(circle);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println();

        // Testing Rectangle
        GeometricObject rectangle = new Rectangle(4.0, 7.0);
        System.out.println(rectangle);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
    }
}

