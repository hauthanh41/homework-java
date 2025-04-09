package Bai4_2;

public class Main {
    public static void main(String[] args) {
        // Testing Person class
        Person person = new Person("Alice Johnson", "123 Main Street");
        System.out.println("=== Testing Person ===");
        System.out.println(person);
        person.setAddress("456 Oak Avenue");
        System.out.println("Updated Person: " + person);

        // Testing Student class
        Student student = new Student("Bob Smith", "789 Pine Street", "Computer Science", 2025, 15000.0);
        System.out.println("\n=== Testing Student ===");
        System.out.println(student);
        student.setProgram("Software Engineering");
        student.setYear(2026);
        student.setFee(16000.0);
        System.out.println("Updated Student: " + student);

        // Testing Staff class
        Staff staff = new Staff("Dr. Emily Davis", "321 Maple Road", "Engineering Faculty", 50000.0);
        System.out.println("\n=== Testing Staff ===");
        System.out.println(staff);
        staff.setSchool("Science Faculty");
        staff.setPay(52000.0);
        System.out.println("Updated Staff: " + staff);
    }
}

