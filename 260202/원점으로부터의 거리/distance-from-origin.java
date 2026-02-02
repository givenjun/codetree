import java.util.*;
import java.lang.*;

class Point implements Comparable<Point> {
    int x;
    int y;
    int n;
    public Point(int x, int y, int n) {
        this.x = x;
        this.y = y;
        this.n = n;
    }
    public void print() {
        System.out.println(n);
    }
    @Override
    public int compareTo(Point p) {
        int d = Math.abs(x) + Math.abs(y);
        int pd = Math.abs(p.x) + Math.abs(p.y);
        if (d == pd)
            return n - p.n;
        return d - pd;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        Point[] point = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
            point[i] = new Point(points[i][0], points[i][1], i + 1);
        }
        // Please write your code here.
        Arrays.sort(point);

        for (Point p : point) {
            p.print();
        }
    }
}