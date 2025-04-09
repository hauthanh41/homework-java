package Bai6_8;
public class Main {
    public static void main(String[] args) {
        // Testing MovablePoint
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println("Original Point: " + point);
        point.moveUp();
        System.out.println("After moving up: " + point);
        point.moveRight();
        System.out.println("After moving right: " + point);

        System.out.println("\n---------------------------\n");

        // Testing MovableRectangle
        MovableRectangle rectangle = new MovableRectangle(0, 0, 4, 4, 1, 1);
        System.out.println("Original Rectangle: " + rectangle);

        rectangle.moveUp();
        System.out.println("After moving up: " + rectangle);

        rectangle.moveRight();
        System.out.println("After moving right: " + rectangle);

        rectangle.moveDown();
        System.out.println("After moving down: " + rectangle);

        rectangle.moveLeft();
        System.out.println("After moving left: " + rectangle);
    }
}


