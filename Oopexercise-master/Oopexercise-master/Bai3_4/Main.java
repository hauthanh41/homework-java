package Bai3_4;

public class Main {
    public static void main(String[] args) {
        // Create a MyTime object
        MyTime time = new MyTime(23, 59, 58);
        System.out.println("Initial time: " + time);

        // Test nextSecond method
        time.nextSecond();
        System.out.println("After nextSecond: " + time);
        time.nextSecond();
        System.out.println("After another nextSecond (should reset to 00:00:00): " + time);

        // Test nextMinute method
        time.nextMinute();
        System.out.println("After nextMinute: " + time);

        // Test nextHour method
        time.nextHour();
        System.out.println("After nextHour: " + time);

        // Test previousSecond method
        time.previousSecond();
        System.out.println("After previousSecond: " + time);

        // Test previousMinute method
        time.previousMinute();
        System.out.println("After previousMinute: " + time);

        // Test previousHour method
        time.previousHour();
        System.out.println("After previousHour: " + time);

        // Set time and display
        time.setTime(12, 30, 45);
        System.out.println("Time after setTime(12, 30, 45): " + time);
    }
}
