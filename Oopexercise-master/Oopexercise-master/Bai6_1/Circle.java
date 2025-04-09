package Bai6_1;
public class Circle extends Shape{
    private double radius ;
    private String color ;
    public Circle(){
        this.radius =1.0;
        this.color = "red";
    }
    public Circle(double radius,String color,boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    @Override
    public double getArea(){
        return radius*radius*Math.PI;
    }
    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ']';
    }
}

