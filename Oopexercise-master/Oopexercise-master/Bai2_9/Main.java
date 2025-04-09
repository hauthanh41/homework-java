package Bai2_9;

public class Main {
    public static void main(String[] args) {
        // Create MyPoint instances
        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(3, 4);
        MyPoint point3 = new MyPoint(6, 8);

        // Display MyPoint details
        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);
        System.out.println("Point 3: " + point3);

        // Create MyTriangle instances
        MyTriangle triangle1 = new MyTriangle(point1, point2, point3);
        MyTriangle triangle2 = new MyTriangle(0, 0, 5, 0, 0, 5);
        MyTriangle triangle3 = new MyTriangle(0, 0, 3, 0, 3, 3);

        // Display MyTriangle details
        System.out.println("\nTriangle 1: " + triangle1);
        System.out.println("Type of Triangle 1: " + triangle1.getType());
        System.out.println("Perimeter of Triangle 1: " + triangle1.getPerimeter());

        System.out.println("\nTriangle 2: " + triangle2);
        System.out.println("Type of Triangle 2: " + triangle2.getType());
        System.out.println("Perimeter of Triangle 2: " + triangle2.getPerimeter());

        System.out.println("\nTriangle 3: " + triangle3);
        System.out.println("Type of Triangle 3: " + triangle3.getType());
        System.out.println("Perimeter of Triangle 3: " + triangle3.getPerimeter());

        // Update Triangle 3's points
        triangle3 = new MyTriangle(0, 0, 4, 0, 2, 3);
        System.out.println("\nUpdated Triangle 3: " + triangle3);
        System.out.println("Updated type of Triangle 3: " + triangle3.getType());
        System.out.println("Updated perimeter of Triangle 3: " + triangle3.getPerimeter());
    }
}
