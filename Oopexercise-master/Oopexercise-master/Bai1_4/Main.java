package Bai1_4;

public class Main {
    public static void main(String[] args) {
        // Create an employee using the constructor
        Employee emp1 = new Employee(1, "John", "Doe", 5000);
        System.out.println(emp1.toString());
        System.out.println("Full Name: " + emp1.getName());
        System.out.println("Monthly Salary: " + emp1.getSalary());
        System.out.println("Annual Salary: " + emp1.getAnnualSalary());
        System.out.println();

        // Raise salary by 10%
        System.out.println("Salary after 10% raise: " + emp1.raiseSalary(10));
        System.out.println(emp1.toString());
        System.out.println();

        // Create another employee and test
        Employee emp2 = new Employee(2, "Jane", "Smith", 7000);
        System.out.println(emp2.toString());
        System.out.println("Full Name: " + emp2.getName());
        System.out.println("Annual Salary: " + emp2.getAnnualSalary());

        // Raise salary by 15%
        System.out.println("Salary after 15% raise: " + emp2.raiseSalary(15));
        System.out.println(emp2.toString());
    }
}
