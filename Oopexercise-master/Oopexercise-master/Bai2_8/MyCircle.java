package Bai2_8;

public class MyCircle {
    private MyPoint center;
    private int radius;
    public MyCircle(){
        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }
    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }
    public MyCircle(int x ,int y ,int radius){
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getCenterX(){
        return center.getX();
    }
    public  void setCenterX(int x){
        center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public  void setCenterY(int y){
        center.setY(y);
    }
    public int[] getCenterXY(){
        return new int[]{center.getX(),center.getY()};
    }
    public void setCenterXY(int x,int y){
        center.setX(x);
        center.setY(y);
    }

    @Override
    public String toString() {
        return "My Circle [radius=" + radius + ", center=" + center.toString()+ "]";
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public double distance(MyCircle another){
        int dx = this.center.getX() - another.center.getX();
        int dy = this.center.getY() - another.center.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }

}
