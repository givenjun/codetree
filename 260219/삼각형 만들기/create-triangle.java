import java.io.*;
import java.lang.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int maxArea = 0;  
        for (int i = 0; i < n; i++) {
            int centerX = x[i];
            int centerY = y[i];
            int maxDistX = 0;
            int maxDistY = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                if (x[j] == centerX) {
                    maxDistY = Math.max(maxDistY, Math.abs(centerY - y[j]));
                }
                if (y[j] == centerY) {
                    maxDistX = Math.max(maxDistX, Math.abs(centerX - x[j]));
                }
                maxArea = Math.max(maxArea, maxDistY * maxDistX);
            }
        }
        System.out.print(maxArea);
    }
}