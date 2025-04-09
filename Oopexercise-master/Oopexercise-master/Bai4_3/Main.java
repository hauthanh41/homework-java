package Bai4_3;

public class Main {
    public static void main(String[] args) {
        // Testing Point2D
        System.out.println("=== Testing Point2D ===");
        Point2D point2D = new Point2D(3.5f, 4.5f);
        System.out.println("Point2D: " + point2D);
        point2D.setX(5.0f);
        point2D.setY(6.0f);
        System.out.println("Updated Point2D: " + point2D);
        float[] xy = point2D.getXY();
        System.out.println("X: " + xy[0] + ", Y: " + xy[1]);

        // Testing Point3D
        System.out.println("\n=== Testing Point3D ===");
        Point3D point3D = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D: " + point3D);
        point3D.setXYZ(4.0f, 5.0f, 6.0f);
        System.out.println("Updated Point3D: " + point3D);
        float[] xyz = point3D.getXYZ();
        System.out.println("X: " + xyz[0] + ", Y: " + xyz[1] + ", Z: " + xyz[2]);
    }
}

