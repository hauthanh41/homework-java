package Bai2_5;

public class Main {
    public static void main(String[] args) {
        // Create a customer
        Customer customer1 = new Customer(101, "Alice");

        // Create an account for the customer with an initial balance
        Account account1 = new Account(1001, customer1, 500.0);

        // Display account details
        System.out.println("Initial Account Details:");
        System.out.println(account1);

        // Deposit money
        account1.deposit(200.0);
        System.out.println("\nAfter Depositing $200:");
        System.out.println(account1);

        // Withdraw money
        account1.withdraw(150.0);
        System.out.println("\nAfter Withdrawing $150:");
        System.out.println(account1);

        // Attempt to withdraw more than the balance
        account1.withdraw(600.0);
        System.out.println("\nAfter Attempting to Withdraw $600:");
        System.out.println(account1);

        // Display customer name from the account
        System.out.println("\nCustomer Name: " + account1.getCustomername());
    }
}
