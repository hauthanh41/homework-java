package Bai6_4;
public class Main {
    public static void main(String[] args) {
        // Testing MovablePoint
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println("Initial MovablePoint: " + point);

        point.moveUp();
        System.out.println("After moveUp(): " + point);

        point.moveRight();
        System.out.println("After moveRight(): " + point);

        point.moveDown();
        System.out.println("After moveDown(): " + point);

        point.moveLeft();
        System.out.println("After moveLeft(): " + point);

        System.out.println();

        // Testing MovableCircle
        MovableCircle circle = new MovableCircle(5, 5, 1, 1, 10);
        System.out.println("Initial MovableCircle: " + circle);

        circle.moveUp();
        System.out.println("After moveUp(): " + circle);

        circle.moveRight();
        System.out.println("After moveRight(): " + circle);

        circle.moveDown();
        System.out.println("After moveDown(): " + circle);

        circle.moveLeft();
        System.out.println("After moveLeft(): " + circle);
    }
}

