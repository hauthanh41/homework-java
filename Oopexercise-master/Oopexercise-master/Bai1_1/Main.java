package Bai1_1;

public class Main {
    public static void main(String[] args) {
        // Create circle using default constructor
        Circle circle1 = new Circle();
        System.out.println(circle1.toString());
        System.out.println("Area: " + circle1.getArea());

        // Create circle using constructor with radius
        Circle circle2 = new Circle(2.5);
        System.out.println(circle2.toString());
        System.out.println("Area: " + circle2.getArea());

        // Create circle using constructor with radius and color
        Circle circle3 = new Circle(3.0, "blue");
        System.out.println(circle3.toString());
        System.out.println("Area: " + circle3.getArea());

        // Modify circle properties using setters
        circle3.setRadius(4.0);
        circle3.setColor("green");
        System.out.println("Updated " + circle3.toString());
        System.out.println("Updated Area: " + circle3.getArea());
    }
}
