import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] dev = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dev[i][0] = Integer.parseInt(st.nextToken());
            dev[i][1] = Integer.parseInt(st.nextToken());
        }

        int maxTime = 0;
        for (int i = 0; i < n; i++) {
            int time = 0;
            int[] timeLine = new int[1001];
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                int start = dev[j][0];
                int end = dev[j][1];

                for (int k = start; k < end; k++) {
                    timeLine[k] = 1;
                }
            }
            for (int j = 0; j < 1001; j++) {
                if (timeLine[j] == 1) time++;
            }
            // for (int j = 0; j < 10; j++) {
            //     System.out.print(timeLine[j]);
            // }
            // System.out.println();
            maxTime = Math.max(maxTime, time);
        }
        System.out.print(maxTime);
    }
}