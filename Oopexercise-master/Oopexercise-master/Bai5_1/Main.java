package Bai5_1;

public class Main {
    public static void main(String[] args) {
        Line line = new Line(0, 0, 3, 4);
        System.out.println(line);  // Should print: Line[begin=(0,0), end=(3,4)]
        System.out.println("Length: " + line.getLength()); // Should be 5
        System.out.println("Gradient: " + line.getGradient());

        LineSub lineSub = new LineSub(new Point(0, 0), new Point(6, 8));
        System.out.println(lineSub);  // Line[begin=(0,0), end=(6,8)]
        System.out.println("Length (LineSub): " + lineSub.getLength()); // 10
        System.out.println("Gradient (LineSub): " + lineSub.getGradient());
    }
}
