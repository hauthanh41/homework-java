package Bai3_5;

public class Main {
    public static void main(String[] args) {
        // Create a MyDate object
        MyDate date = new MyDate(2024, 2, 28); // Leap year test
        System.out.println("Initial date: " + date);

        // Test nextDay (Leap year)
        date.nextDay();
        System.out.println("After nextDay (Leap year - should be 29 Feb): " + date);

        date.nextDay();
        System.out.println("After another nextDay (Should be 1 Mar): " + date);

        // Test previousDay
        date.previousDay();
        System.out.println("After previousDay (Should return to 29 Feb): " + date);

        // Test nextMonth
        date.nextMonth();
        System.out.println("After nextMonth: " + date);

        // Test previousMonth
        date.previousMonth();
        System.out.println("After previousMonth: " + date);

        // Test nextYear
        date.nextYear();
        System.out.println("After nextYear: " + date);

        // Test previousYear
        date.previousYear();
        System.out.println("After previousYear: " + date);

        // Edge case: 31 Dec to 1 Jan transition
        date.setDate(2023, 12, 31);
        System.out.println("Set date to 31 Dec 2023: " + date);
        date.nextDay();
        System.out.println("After nextDay (Should be 1 Jan 2024): " + date);

        // Edge case: 1 Jan to 31 Dec transition
        date.previousDay();
        System.out.println("After previousDay (Should be 31 Dec 2023): " + date);

        // Invalid date test
        try {
            date.setDate(2024, 2, 30);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception for invalid date: " + e.getMessage());
        }

        // Display day of the week for a known date
        date.setDate(2025, 2, 22); // Example date
        System.out.println("Day of the week for 22 Feb 2025: " + date);
    }
}
