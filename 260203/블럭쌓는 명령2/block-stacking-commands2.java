import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] list = new int[n + 1];

        for (int i = 0; i < k; i++) {
            String[] se = br.readLine().split(" ");
            int s = Integer.parseInt(se[0]);
            int e = Integer.parseInt(se[1]);
            for (int j = s; j <= e; j++) {
                list[j]++;
            }
        }
        Arrays.sort(list);

        System.out.println(list[n]);
    }
}