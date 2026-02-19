import java.io.*;
import java.lang.*;

public class Main {
    public static int[] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int n = str.length;
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int sum1 = 0, sum2 = 0, sum3 = 0, total = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];
        }
        int minDif = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum1 = arr[i] + arr[j];
                for (int x = 0; x < n; x++) {
                    if (x == i || x == j) continue;
                    for (int y = x + 1; y < n; y++) {
                        if (y == i || y == j) continue;
                        sum2 = arr[x] + arr[y];
                        sum3 = total - sum1 - sum2;
                        // System.out.println(sum1 + " " + sum2 + " " + sum3);
                        int highVal = Math.max(sum1, Math.max(sum2, sum3));
                        int lowVal = Math.min(sum1, Math.min(sum2, sum3));
                        minDif = Math.min(minDif, highVal - lowVal);
                    }
                }
            }
        }
        System.out.println(minDif);
    }
}