package Bai6_5;
public class ResizeableCircle extends Circle implements Resizeable {
    public ResizeableCircle(double radius) {
        super(radius);
    }
    public String toString(){
        return "ResizeableCircle["+ super.toString()+"]";
    }
    @Override
    public void resize(int percent) {
        radius *= percent/100;
    }
}

