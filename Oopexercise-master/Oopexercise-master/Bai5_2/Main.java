package Bai5_2;

public class Main {
    public static void main(String[] args) {
        // Test Circle class
        Circle circle1 = new Circle();
        System.out.println(circle1);
        System.out.println("Circle radius: " + circle1.getRadius());
        System.out.println("Circle color: " + circle1.getColor());
        System.out.println("Circle area: " + circle1.getArea());

        Circle circle2 = new Circle(3.5, "blue");
        System.out.println(circle2);
        System.out.println("Circle radius: " + circle2.getRadius());
        System.out.println("Circle color: " + circle2.getColor());
        System.out.println("Circle area: " + circle2.getArea());

        // Test Cylinder class
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);
        System.out.println("Cylinder height: " + cylinder1.getHeight());
        System.out.println("Cylinder base radius: " + cylinder1.getBase().getRadius());
        System.out.println("Cylinder base area: " + cylinder1.getBase().getArea());
        System.out.println("Cylinder volume: " + cylinder1.getVolume());
        System.out.println("Cylinder surface area: " + cylinder1.getSurfaceArea());

        Cylinder cylinder2 = new Cylinder(3.5, "green", 5.0);
        System.out.println(cylinder2);
        System.out.println("Cylinder height: " + cylinder2.getHeight());
        System.out.println("Cylinder base radius: " + cylinder2.getBase().getRadius());
        System.out.println("Cylinder base color: " + cylinder2.getBase().getColor());
        System.out.println("Cylinder base area: " + cylinder2.getBase().getArea());
        System.out.println("Cylinder volume: " + cylinder2.getVolume());
        System.out.println("Cylinder surface area: " + cylinder2.getSurfaceArea());
    }
}


