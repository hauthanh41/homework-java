package Bai2_9;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }
    public MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3){
        this.v1 =v1;
        this.v2 =v2;
        this.v3 = v3;
    }
    public String toString(){
        return "MyTriangle[v1="+v1.toString()+",v2="+v2.toString()+",v3="+v3.toString()+"]";
    }
    public double getPerimeter(){
        double x = this.v1.distance(this.v2);
        double y = this.v2.distance(this.v3);
        double z = this.v3.distance(this.v1);
        return x+y+z;
    }
    public String getType(){
        double x = this.v1.distance(this.v2);
        double y = this.v2.distance(this.v3);
        double z = this.v3.distance(this.v1);
        String perform ="";
        if (x == y && y ==z){
            perform = "equilateral";
        }else if(x!=y && y!=z && x!=z){
            perform = "scalene" ;
        }else{
            perform ="isosceles";
        }
        return perform;


    }
}
