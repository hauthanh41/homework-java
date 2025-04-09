package Bai2_10;

public class Main {
    public static void main(String[] args) {
        // Create MyPoint instances
        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(5, 5);
        MyPoint point3 = new MyPoint(10, 0);

        // Display MyPoint details
        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);
        System.out.println("Point 3: " + point3);

        // Create MyRectangle instances
        MyRectangle rectangle1 = new MyRectangle(point1, point3);
        MyRectangle rectangle2 = new MyRectangle(2, 7, 8, 2);

        // Display MyRectangle details
        System.out.println("\nRectangle 1: " + rectangle1);
        System.out.println("Perimeter of Rectangle 1: " + rectangle1.getPerimeter());
        System.out.println("Area of Rectangle 1: " + rectangle1.getArea());

        System.out.println("\nRectangle 2: " + rectangle2);
        System.out.println("Perimeter of Rectangle 2: " + rectangle2.getPerimeter());
        System.out.println("Area of Rectangle 2: " + rectangle2.getArea());

        // Update Rectangle 2's points
        rectangle2 = new MyRectangle(1, 5, 6, 1);
        System.out.println("\nUpdated Rectangle 2: " + rectangle2);
        System.out.println("Updated perimeter of Rectangle 2: " + rectangle2.getPerimeter());
        System.out.println("Updated area of Rectangle 2: " + rectangle2.getArea());
    }
}
