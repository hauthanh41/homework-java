package Bai4_5;


public class Main {
    public static void main(String[] args) {
        // Testing Shape class
        System.out.println("=== Testing Shape ===");
        Shape shape = new Shape();
        System.out.println(shape);
        shape.setColor("blue");
        shape.setFilled(false);
        System.out.println("Updated Shape: " + shape);

        // Testing Circle class
        System.out.println("\n=== Testing Circle ===");
        Circle circle = new Circle(5.0, "green", true);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Testing Rectangle class
        System.out.println("\n=== Testing Rectangle ===");
        Rectangle rectangle = new Rectangle(4.0, 6.0, "yellow", false);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Testing Square class
        System.out.println("\n=== Testing Square ===");
        Square square = new Square(4.0, "purple", true);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        // Update square side
        square.setSide(6.0);
        System.out.println("Updated Square (side=6.0): " + square);
        System.out.println("Area after update: " + square.getArea());
        System.out.println("Perimeter after update: " + square.getPerimeter());
    }
}

