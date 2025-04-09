package Bai6_5;
public class Main {
    public static void main(String[] args) {
        // Testing Circle
        Circle circle = new Circle(5.0);
        System.out.println("Original Circle: " + circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println();

        // Testing ResizeableCircle
        ResizeableCircle resizableCircle = new ResizeableCircle(5.0);
        System.out.println("Original ResizeableCircle: " + resizableCircle);
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());

        // Resizing the circle by 150%
        resizableCircle.resize(150);
        System.out.println("\nAfter resizing by 150%:");
        System.out.println("Resized ResizeableCircle: " + resizableCircle);
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
    }
}

