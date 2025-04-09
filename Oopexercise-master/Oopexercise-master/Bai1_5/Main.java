package Bai1_5;

public class Main {
    public static void main(String[] args) {
        // Create an invoice item
        InvoiceItem item1 = new InvoiceItem("A101", "Wireless Mouse", 3, 15.99);
        System.out.println(item1.toString());
        System.out.println("Total Price: $" + item1.getTotal());
        System.out.println();

        // Create another invoice item
        InvoiceItem item2 = new InvoiceItem("B202", "Mechanical Keyboard", 2, 79.50);
        System.out.println(item2.toString());
        System.out.println("Total Price: $" + item2.getTotal());
        System.out.println();

        // Update quantity and unit price
        item2.setQty(3);
        item2.setUnitPrice(75.00);
        System.out.println("Updated " + item2.toString());
        System.out.println("Updated Total Price: $" + item2.getTotal());
    }
}
