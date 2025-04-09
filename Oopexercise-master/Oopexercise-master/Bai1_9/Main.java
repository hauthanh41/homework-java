package Bai1_9;

public class Main {
    public static void main(String[] args) {
        // Create a Ball object
        Ball ball = new Ball(0.0f, 0.0f, 5, 1.5f, 2.0f);
        System.out.println("Initial Ball Position: " + ball.toString());

        // Move the ball a few times
        ball.move();
        System.out.println("After 1st move: " + ball.toString());
        ball.move();
        System.out.println("After 2nd move: " + ball.toString());

        // Reflect horizontally
        System.out.println("\nReflecting horizontally...");
        ball.reflectHorizontal();
        ball.move();
        System.out.println("After horizontal reflection and move: " + ball.toString());

        // Reflect vertically
        System.out.println("\nReflecting vertically...");
        ball.reflectVertical();
        ball.move();
        System.out.println("After vertical reflection and move: " + ball.toString());

        // Update position and speed using setters
        System.out.println("\nUpdating ball properties...");
        ball.setX(10.0f);
        ball.setY(15.0f);
        ball.setxDelta(3.0f);
        ball.setyDelta(4.0f);
        System.out.println("Updated Ball: " + ball.toString());
    }
}
