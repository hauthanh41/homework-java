package Bai4_4;

public class Main {
    public static void main(String[] args) {
        // Testing Point class
        System.out.println("=== Testing Point ===");
        Point point = new Point(2.5f, 3.5f);
        System.out.println("Point: " + point);
        point.setXY(4.0f, 5.0f);
        System.out.println("Updated Point: " + point);
        float[] xy = point.getXY();
        System.out.println("X: " + xy[0] + ", Y: " + xy[1]);

        // Testing MovablePoint class
        System.out.println("\n=== Testing MovablePoint ===");
        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println("MovablePoint (initial): " + movablePoint);
        movablePoint.move();
        System.out.println("MovablePoint (after move): " + movablePoint);
        movablePoint.setSpeed(1.0f, 1.0f);
        movablePoint.move().move(); // Move twice
        System.out.println("MovablePoint (after two more moves): " + movablePoint);
    }
}

