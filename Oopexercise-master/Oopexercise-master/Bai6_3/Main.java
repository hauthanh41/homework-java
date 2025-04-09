package Bai6_3;

public class Main {
    public static void main(String[] args) {
        // Create a MovablePoint object
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println("Initial Position: " + point);

        // Move the point up
        point.moveUp();
        System.out.println("After moveUp(): " + point);

        // Move the point right
        point.moveRight();
        System.out.println("After moveRight(): " + point);

        // Move the point down
        point.moveDown();
        System.out.println("After moveDown(): " + point);

        // Move the point left
        point.moveLeft();
        System.out.println("After moveLeft(): " + point);
    }
}

