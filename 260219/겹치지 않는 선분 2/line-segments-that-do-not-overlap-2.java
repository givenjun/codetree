import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] start = new int[n];
        int[] end = new int[n]; 

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            start[i] = Integer.parseInt(st.nextToken());
            end[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            boolean cross = false;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                if (start[i] < start[j]) {
                    if (end[i] > end[j]) {
                        cross = true;
                        break;
                    }
                }

                if (start[i] > start[j]) {
                    if (end[i] < end[j]) {
                        cross = true;
                        break;
                    }
                }
            }
            if (!cross) cnt++;
        }
        System.out.print(cnt);
    }
}