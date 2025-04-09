package Bai1_2;

public class Main {
    public static void main(String[] args) {
        // Create circle using default constructor
        Circle circle1 = new Circle();
        System.out.println(circle1.toString());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Circumference: " + circle1.getCircumference());
        System.out.println();

        // Create circle using constructor with radius
        Circle circle2 = new Circle(2.5);
        System.out.println(circle2.toString());
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Circumference: " + circle2.getCircumference());
        System.out.println();

        // Modify circle properties using setters
        circle2.setRadius(4.0);
        System.out.println("Updated " + circle2.toString());
        System.out.println("Updated Area: " + circle2.getArea());
        System.out.println("Updated Circumference: " + circle2.getCircumference());
    }
}
