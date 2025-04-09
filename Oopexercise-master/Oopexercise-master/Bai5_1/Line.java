package Bai5_1;
public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        this(new Point(beginX, beginY), new Point(endX, endY));
    }

    @Override
    public String toString() {
        return "Line[begin=" + begin + ", end=" + end + "]";
    }

    public Point getBegin() { return new Point(begin.getX(), begin.getY()); }
    public Point getEnd() { return new Point(end.getX(), end.getY()); }
    public void setBegin(Point begin) { this.begin = begin; }
    public void setEnd(Point end) { this.end = end; }
    public void setEndX(int x) { end.setX(x); }
    public void setEndY(int y) { end.setY(y); }
    public void setEndXY(int x, int y) { end.setXY(x, y); }

    public int getLength() {
        int xDiff = begin.getX() - end.getX();
        int yDiff = begin.getY() - end.getY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = begin.getX() - end.getX();
        int yDiff = begin.getY() - end.getY();
        return Math.atan2(yDiff, xDiff);
    }
}