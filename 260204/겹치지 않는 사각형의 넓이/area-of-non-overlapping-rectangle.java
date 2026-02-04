import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] rect = new boolean[2001][2001];
        
        for (int i = 0; i < 3; i++) {
            String[] points = br.readLine().split(" ");
            int x1 = Integer.parseInt(points[0]) + 1000;
            int y1 = Integer.parseInt(points[1]) + 1000;
            int x2 = Integer.parseInt(points[2]) + 1000;
            int y2 = Integer.parseInt(points[3]) + 1000;

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    if (i < 2) rect[j][k] = true;
                    else rect[j][k] = false;
                }
            }
        }

        int area = 0;

        for (boolean[] r : rect) {
            for (boolean point : r ) {
                if (point) area++;
            }
        }
        System.out.print(area);
    }
}