package Bai7_1;

public class Main {
    public static void main(String[] args) {
        // Create customer and date
        Customer customer1 = new Customer("Alice");
        customer1.setMember(true);
        customer1.setMemberType("Prenium");  // Premium member

        Date visitDate = new Date(22, 2, 2025);

        // Create a visit instance
        Visit visit1 = new Visit(customer1, visitDate);
        visit1.setServiceExpense(200.0);
        visit1.setProductExpense(100.0);

        // Output details
        System.out.println(visit1);
        System.out.printf("Total expense after discount: $%.2f\n", visit1.getTotalExpense());

        System.out.println("\n---------------------------\n");

        // Another customer with Gold membership
        Customer customer2 = new Customer("Bob");
        customer2.setMember(true);
        customer2.setMemberType("Gold");

        Visit visit2 = new Visit(customer2, visitDate);
        visit2.setServiceExpense(150.0);
        visit2.setProductExpense(50.0);

        System.out.println(visit2);
        System.out.printf("Total expense after discount: $%.2f\n", visit2.getTotalExpense());

        System.out.println("\n---------------------------\n");

        // Non-member customer
        Customer customer3 = new Customer("Charlie");

        Visit visit3 = new Visit(customer3, visitDate);
        visit3.setServiceExpense(120.0);
        visit3.setProductExpense(80.0);

        System.out.println(visit3);
        System.out.printf("Total expense after discount: $%.2f\n", visit3.getTotalExpense());
    }
}

