package Bai2_8;

public class Main {
    public static void main(String[] args) {
        // Create MyPoint instances
        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(3, 4);

        // Display MyPoint details
        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);

        // Create MyCircle instances
        MyCircle circle1 = new MyCircle(); // Default circle
        MyCircle circle2 = new MyCircle(point2, 5);
        MyCircle circle3 = new MyCircle(1, 2, 3);

        // Display MyCircle details
        System.out.println("\nCircle 1: " + circle1);
        System.out.println("Circle 2: " + circle2);
        System.out.println("Circle 3: " + circle3);

        // Calculate and display area and perimeter
        System.out.println("\nArea of Circle 2: " + circle2.getArea());
        System.out.println("Perimeter of Circle 2: " + circle2.getPerimeter());

        System.out.println("Area of Circle 3: " + circle3.getArea());
        System.out.println("Perimeter of Circle 3: " + circle3.getPerimeter());

        // Distance between circle centers
        System.out.println("\nDistance between centers of Circle 2 and Circle 3: " + circle2.distance(circle3));

        // Update Circle 3's center and radius
        circle3.setCenterXY(6, 8);
        circle3.setRadius(7);
        System.out.println("\nUpdated Circle 3: " + circle3);
        System.out.println("New area of Circle 3: " + circle3.getArea());
        System.out.println("New perimeter of Circle 3: " + circle3.getPerimeter());
        System.out.println("New distance between centers of Circle 2 and Circle 3: " + circle2.distance(circle3));
    }
}
