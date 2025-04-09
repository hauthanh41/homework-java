package Bai3_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing MyPolynomial ---");
        MyPolynomial poly1 = new MyPolynomial(1.0, 2.0, 3.0); // 3x^2 + 2x + 1
        MyPolynomial poly2 = new MyPolynomial(0.0, -1.0, 2.0); // 2x^2 - x

        System.out.println("Polynomial 1: " + poly1);
        System.out.println("Polynomial 2: " + poly2);
        System.out.println("Degree of Polynomial 1: " + poly1.getDegree());
        System.out.println("Evaluate Polynomial 1 at x=2: " + poly1.evaluate(2));
        System.out.println("Sum of Polynomial 1 and 2: " + poly1.add(poly2));
        System.out.println("Product of Polynomial 1 and 2: " + poly1.multiply(poly2));
    }
}
