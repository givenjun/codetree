import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] students = new int[n];

        for (int i = 0; i < n; i++) {
            students[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(students);

        int maxCnt = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                
                if (i == j) sum += students[j] / 2;
                else sum += students[j];

                if (sum > b) {
                    break;
                }

                cnt++;
            
                // System.out.print(sum + " ");
            }
            // System.out.println();
            maxCnt = Math.max(maxCnt, cnt);
        }

        System.out.print(maxCnt);
    }
}