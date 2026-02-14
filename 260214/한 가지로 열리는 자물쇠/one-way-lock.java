import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] list = new int[3];
        String[] comb = br.readLine().split(" ");

        for (int i = 0; i < 3; i++) {
            list[i] = Integer.parseInt(comb[i]);
        }
        
        int  cnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (Math.abs(list[0] - i) <= 2 || Math.abs(list[1] - j) <= 2 || Math.abs(list[2] - k) <= 2) cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}