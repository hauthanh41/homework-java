package Bai1_7;

public class Main {
    public static void main(String[] args) {
        // Create a date object
        Date date1 = new Date(22, 2, 2025);
        System.out.println("Initial Date: " + date1.toString());

        // Update the date
        System.out.println("\nUpdating the date...");
        date1.setDay(1);
        date1.setMonth(3);
        date1.setYear(2025);
        System.out.println("Updated Date: " + date1.toString());

        // Create another date
        Date date2 = new Date(31, 12, 2024);
        System.out.println("\nAnother Date: " + date2.toString());

        // Access individual components
        System.out.println("\nDay: " + date2.getDay());
        System.out.println("Month: " + date2.getMonth());
        System.out.println("Year: " + date2.getYear());
    }
}
