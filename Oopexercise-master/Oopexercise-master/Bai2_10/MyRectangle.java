package Bai2_10;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;
    public MyRectangle(int x1,int y1,int x2,int y2){
        this.bottomRight=new MyPoint(x2,y2);
        this.topLeft = new MyPoint(x1,y1);
    }
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    public String toString(){
        return "MyRectangle[topLeft ="+topLeft.toString()+","+bottomRight.toString()+"]";
    }
    public double getPerimeter(){
        double a = Math.abs(this.bottomRight.getX() - this.topLeft.getX());
        double b = Math.abs(this.bottomRight.getY() - this.topLeft.getY());
        return (a+b)*2;
    }
    public double getArea(){
        double a = Math.abs(this.bottomRight.getX() - this.topLeft.getX());
        double b = Math.abs(this.bottomRight.getY() - this.topLeft.getY());
        return a*b;
    }
}
