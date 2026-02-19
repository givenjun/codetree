import java.io.*;
import java.lang.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        int minA = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE, maxX = 0, maxY = 0, area = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                minX = Math.min(minX, points[j][0]);
                minY = Math.min(minY, points[j][1]);
                maxX = Math.max(maxX, points[j][0]);
                maxY = Math.max(maxY, points[j][1]);
            }
            area = (maxX - minX) * (maxY - minY);
            minA = Math.min(minA, area);
        }
        System.out.println(minA);
    }
}