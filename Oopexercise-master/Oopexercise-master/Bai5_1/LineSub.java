package Bai5_1;


public class LineSub extends Point{
    Point end;
    public LineSub(int beginX, int beginY,int endX,int endY){
        super(beginX,beginY);
        this.end = new Point(endX,endY);
    }
    public LineSub(Point begin,Point end){
        super.setXY(begin.getX(), begin.getY());
        super.setXY(end.getX(), end.getY());
    }

    @Override
    public String toString() {
        return "Line=begin="+super.toString()+",end ="+end.toString()+"]";

    }
    public Point getBegin(){
        return new Point(super.getX(),super.getY());
    }
    public Point getEnd(){
        return new Point(end.getX(),end.getY());
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    public void setBegin(Point begin){
        setXY(begin.getX(), begin.getY());
    }
    public int getBeginX(){
        return super.getX();
    }
    public  int getBeginY(){
        return super.getY();
    }
    public int getEndX(){
        return end.getX();
    }
    public int getEndY(){
        return end.getY();
    }
    public  void setBeginX(int x){
        super.setX(x);
    }
    public void setBeginY(int y){
        super.setY(y);
    }
    public void setBeginXY(int x,int y){
        super.setXY(x,y);
    }
    public  void setEndX(int x){
        super.setX(x);
    }
    public void setEndY(int y){
        super.setY(y);
    }
    public void setEndXY(int x,int y){
        super.setXY(x,y);
    }
    public int getLength(){
        int xDiff = getBeginX()- getEndX();
        int yDiff = getBeginY() - getEndY();
        xDiff*=-1;
        yDiff*=-1;
        return (int) (Math.sqrt(xDiff*xDiff+yDiff*yDiff));
    }
    public double getGradient(){
        int xDiff = getBeginX()- getEndX();
        int yDiff = getBeginY() - getEndY();
        xDiff*=-1;
        yDiff*=-1;
        return (double) (Math.atan2(yDiff,xDiff));
    }

}

