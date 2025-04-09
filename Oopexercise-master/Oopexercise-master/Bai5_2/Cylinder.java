package Bai5_2;


public class Cylinder {
    private double height ;
    private Circle base;
    public Cylinder(){
        this.base = new Circle();
        this.height =1.0;
    }
    public Cylinder(double radius,String color, double height){
        this.base = new Circle(radius,color);
        this.height = height;
    }
    public Circle getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(Circle base) {
        this.base = base;
    }
    public double getVolume(){
        return base.getArea()*height;
    }
    public double getSurfaceArea() {
        return 2 * Math.PI * base.getRadius() *this.height + 2 * base.getArea();
    }
    @Override
    public String toString() {
        return "Cylinder[" +
                "height=" + height +
                ", base=" + base +
                ']';
    }
}

