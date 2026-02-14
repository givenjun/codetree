import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nht = br.readLine().split(" ");
        int n = Integer.parseInt(nht[0]);
        int h = Integer.parseInt(nht[1]);
        int t = Integer.parseInt(nht[2]);

        String[] arrStr = br.readLine().split(" ");
        int[] arrInt = new int[n];
        int[] arrDif = new int[n];

        for (int i = 0; i < n; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
            arrDif[i] = Math.abs(arrInt[i] - h);
        }
        
        int cost = Integer.MAX_VALUE;
        for (int i = 0; i <= n - t; i++) {
            int sum = 0;
            for (int j = i; j < i + t; j++) {
                // System.out.print(j + " ");
                sum += arrDif[j];
            }
            cost = Math.min(cost, sum);
            // System.out.println();
        }

        System.out.println(cost);
    }
}