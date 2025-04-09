package Bai3_1;

public class Main {
    public static void main(String[] args) {
        MyComplex complex1 = new MyComplex(3, 4);
        MyComplex complex2 = new MyComplex(1, -2);

        // Display MyComplex details
        System.out.println("Complex Number 1: " + complex1);
        System.out.println("Complex Number 2: " + complex2);

        // Check if the complex numbers are real or imaginary
        System.out.println("Complex 1 is real? " + complex1.isReal());
        System.out.println("Complex 1 is imaginary? " + complex1.isImaginary());
        System.out.println("Complex 2 is real? " + complex2.isReal());
        System.out.println("Complex 2 is imaginary? " + complex2.isImaginary());

        // Perform addition
        MyComplex sum = complex1.addNew(complex2);
        System.out.println("Sum of Complex 1 and Complex 2: " + sum);

        // Perform subtraction
        MyComplex difference = complex1.subtractNew(complex2);
        System.out.println("Difference between Complex 1 and Complex 2: " + difference);

        // Perform multiplication
        MyComplex product = complex1.multiply(complex2);
        System.out.println("Product of Complex 1 and Complex 2: " + product);

        // Perform division
        MyComplex quotient = complex1.divide(complex2);
        System.out.println("Quotient of Complex 1 divided by Complex 2: " + quotient);

        // Display magnitude and argument
        System.out.println("Magnitude of Complex 1: " + complex1.magniture());
        System.out.println("Argument of Complex 1 (in radians): " + complex1.argument());

        // Display conjugate
        System.out.println("Conjugate of Complex 1: " + complex1.conjugate());
    }
}
