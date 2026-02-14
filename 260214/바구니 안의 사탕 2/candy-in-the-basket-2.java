import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] basket = new int[101];

        for (int i = 0; i < n; i++) {
            String[] cp = br.readLine().split(" ");
            int candy = Integer.parseInt(cp[0]);
            int position = Integer.parseInt(cp[1]);

            basket[position] += candy;
        }

        int max = 0;
        for (int i = k + 1; i < 101 - k - 1; i++) {
            int cnt = 0;
            for (int j = i - k; j < i + k + 1; j++) {
                cnt += basket[j];
                // System.out.print(j + " ");
            }
            max = Math.max(cnt, max);
            // System.out.println(i);
        }

        System.out.print(max);
    }
}