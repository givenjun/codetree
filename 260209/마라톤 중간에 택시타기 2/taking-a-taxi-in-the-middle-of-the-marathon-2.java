import java.io.*;
import java.lang.*;

public class Main {
    public static int distance(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] points = new int[n][2];
        int min = Integer.MAX_VALUE;
 
        for (int i = 0; i < n; i++) {
            String[] xy = br.readLine().split(" ");
            points[i][0] = Integer.parseInt(xy[0]);
            points[i][1] = Integer.parseInt(xy[1]);
        }

        for (int i = 1; i < n - 1; i++) {
            int dist = 0;
            for (int j = 0; j < n - 1; j++) {
                int x1 = points[j][0];
                int y1 = points[j][1];
                if (i == (j + 1)) j++;
                int x2 = points[j + 1][0];
                int y2 = points[j + 1][1]; 

                dist += distance(x1, y1, x2, y2);
                // System.out.println("(" + x1 + "," + y1 + ")" + " " + "(" + x2 + "," + y2 + ")");
            }
            min = (dist < min) ? dist : min;
        }

        System.out.print(min);
    }
}