import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] list = new int[101];

        for (int i = 0; i < n; i++) {
            String[] se = br.readLine().split(" ");
            int s = Integer.parseInt(se[0]);
            int e = Integer.parseInt(se[1]);
            for (int j = s; j <= e; j++) {
                list[j]++;
            }
        }

        int max = 0;
        for (int l : list) {
            if (l > max) max = l;
        }
        System.out.print(max);
    }
}