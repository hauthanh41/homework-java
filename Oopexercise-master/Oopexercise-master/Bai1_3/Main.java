package Bai1_3;

public class Main {
    public static void main(String[] args) {
        // Create rectangle using default constructor
        Rectangle rect1 = new Rectangle();
        System.out.println(rect1.toString());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());
        System.out.println();

        // Create rectangle using parameterized constructor
        Rectangle rect2 = new Rectangle(4.5f, 3.2f);
        System.out.println(rect2.toString());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
        System.out.println();

        // Modify rectangle properties using setters
        rect2.setWidth(5.0f);
        rect2.setHeight(2.0f);
        System.out.println("Updated " + rect2.toString());
        System.out.println("Updated Area: " + rect2.getArea());
        System.out.println("Updated Perimeter: " + rect2.getPerimeter());
    }
}
