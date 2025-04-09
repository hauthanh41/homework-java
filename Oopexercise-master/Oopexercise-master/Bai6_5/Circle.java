package Bai6_5;

public class Circle implements GeometricObject{
    protected double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle["+radius+"]";
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius*2*Math.PI;
    }

}

