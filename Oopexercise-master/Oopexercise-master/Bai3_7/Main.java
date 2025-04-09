package Bai3_7;

public class Main {
    public static void main(String[] args) {
        // Create a Ball object at position (0, 0, 0)
        Ball ball = new Ball(0.0f, 0.0f, 0.0f);
        System.out.println("Initial Ball position: " + ball);

        // Create two Player objects
        Player player1 = new Player(1, 2.0f, 3.0f);
        Player player2 = new Player(2, 10.0f, 12.0f);

        // Display initial positions
        System.out.println("Player 1 position: (" + player1.getX() + "," + player1.getY() + "," + player1.getZ() + ")");
        System.out.println("Player 2 position: (" + player2.getX() + "," + player2.getY() + "," + player2.getZ() + ")");

        // Player 1 moves and jumps
        player1.move(1.0f, 1.0f);
        player1.jump(2.0f);
        System.out.println("Player 1 after moving and jumping: (" + player1.getX() + "," + player1.getY() + "," + player1.getZ() + ")");

        // Check if Player 1 is near the ball
        if (player1.near(ball)) {
            System.out.println("Player 1 is near the ball and kicks it!");
            player1.kick(ball);
            System.out.println("Ball after Player 1 kicks: " + ball);
        } else {
            System.out.println("Player 1 is not near the ball.");
        }

        // Player 2 moves closer to the ball
        player2.move(-5.0f, -5.0f);
        System.out.println("Player 2 after moving: (" + player2.getX() + "," + player2.getY() + "," + player2.getZ() + ")");

        // Check if Player 2 is near the ball
        if (player2.near(ball)) {
            System.out.println("Player 2 is near the ball and kicks it!");
            player2.kick(ball);
            System.out.println("Ball after Player 2 kicks: " + ball);
        } else {
            System.out.println("Player 2 is not near the ball.");
        }

        // Final positions
        System.out.println("Final Ball position: " + ball);
    }
}

