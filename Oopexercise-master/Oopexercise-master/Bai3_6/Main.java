package Bai3_6;

public class Main {
    public static void main(String[] args) {
        // Create a Ball object at position (0, 0), radius 5, speed 10, direction 45 degrees
        Ball ball = new Ball(0.0f, 0.0f, 5, 10, 45);
        System.out.println("Initial position: " + ball);

        // Move the ball
        ball.move();
        System.out.println("After 1st move: " + ball);

        ball.move();
        System.out.println("After 2nd move: " + ball);

        // Reflect horizontally and move
        ball.reflectHorizontal();
        ball.move();
        System.out.println("After horizontal reflection and move: " + ball);

        // Reflect vertically and move
        ball.reflectVertical();
        ball.move();
        System.out.println("After vertical reflection and move: " + ball);

        // Update position and speed manually
        ball.setX(50.0f);
        ball.setY(50.0f);
        ball.setXDelta(5.0f);
        ball.setYDelta(-5.0f);
        System.out.println("After manual updates: " + ball);

        // Final move
        ball.move();
        System.out.println("After final move: " + ball);
    }
}

