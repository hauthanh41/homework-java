package Bai2_7;

public class Main {
    public static void main(String[] args) {
        // Create MyPoint instances
        MyPoint point1 = new MyPoint(); // Default (0,0)
        MyPoint point2 = new MyPoint(3, 4);

        // Display initial points
        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);

        // Calculate distance between point1 and point2
        System.out.println("Distance between Point 1 and Point 2: " + point1.distance(point2));

        // Calculate distance from point2 to coordinates (0,0)
        System.out.println("Distance of Point 2 from (0,0): " + point2.distance());

        // Set new coordinates for point1
        point1.setXY(5, 6);
        System.out.println("Updated Point 1: " + point1);

        // Distance after updating point1
        System.out.println("New distance between Point 1 and Point 2: " + point1.distance(point2));

        // Distance from point1 to a specified coordinate
        System.out.println("Distance from Point 1 to (1,1): " + point1.distance(1, 1));

        // Create MyLine instances
        MyLine line1 = new MyLine(point1, point2);
        MyLine line2 = new MyLine(0, 0, 3, 4);

        // Display line details
        System.out.println("\nLine 1: " + line1);
        System.out.println("Line 2: " + line2);

        // Display length and gradient of the lines
        System.out.println("Length of Line 1: " + line1.getLength());
        System.out.println("Gradient of Line 1 (in radians): " + line1.getGradient());

        System.out.println("Length of Line 2: " + line2.getLength());
        System.out.println("Gradient of Line 2 (in radians): " + line2.getGradient());

        // Update endpoints of Line 1
        line1.setBeginXY(1, 1);
        line1.setEndXY(4, 5);
        System.out.println("\nUpdated Line 1: " + line1);
        System.out.println("New length of Line 1: " + line1.getLength());
        System.out.println("New gradient of Line 1 (in radians): " + line1.getGradient());
    }
}
