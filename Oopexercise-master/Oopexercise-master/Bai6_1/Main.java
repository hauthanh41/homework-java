package Bai6_1;

public class Main {
    public static void main(String[] args) {
        // Testing Circle
        Circle circle = new Circle(5.0, "blue", true);
        System.out.println(circle);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Color: " + circle.getColor());
        System.out.println("Circle Filled: " + circle.isFilled());
        System.out.println();

        // Testing Rectangle
        Rectangle rectangle = new Rectangle(4.0, 7.0, "green", false);
        System.out.println(rectangle);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle Color: " + rectangle.getColor());
        System.out.println("Rectangle Filled: " + rectangle.isFilled());
        System.out.println();

        // Testing Square
        Square square = new Square(3.0, "yellow", true);
        System.out.println(square);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
        System.out.println("Square Side: " + square.getSide());
        System.out.println("Square Color: " + square.getColor());
        System.out.println("Square Filled: " + square.isFilled());
        System.out.println();

        // Updating Square side
        square.setSide(5.0);
        System.out.println("Updated Square: " + square);
        System.out.println("Updated Square Area: " + square.getArea());
        System.out.println("Updated Square Perimeter: " + square.getPerimeter());
    }
}

