package Bai1_8;

public class Main {
    public static void main(String[] args) {
        // Create a time object
        Time time1 = new Time(23, 59, 58);
        System.out.println("Initial Time: " + time1.toString());

        // Increment time by one second
        time1.nextSecond();
        System.out.println("After nextSecond(): " + time1.toString());
        time1.nextSecond();
        System.out.println("After another nextSecond(): " + time1.toString());

        // Decrement time by one second (accessed via reflection since it's private)
        System.out.println("\nTesting previousSecond() using reflection...");
        try {
            java.lang.reflect.Method previousSecondMethod = Time.class.getDeclaredMethod("previousSecond");
            previousSecondMethod.setAccessible(true);
            previousSecondMethod.invoke(time1);
            System.out.println("After previousSecond(): " + time1.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Update time using setters
        System.out.println("\nUpdating time to 12:00:00...");
        time1.setHour(12);
        time1.setMinute(0);
        time1.setSecond(0);
        System.out.println("Updated Time: " + time1.toString());
    }
}
