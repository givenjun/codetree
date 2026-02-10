import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        char[] pos = new char[10001];

        int start = 10000;
        int end = 0;
        for (int i = 0; i < n; i++) {
            String[] xs = br.readLine().split(" ");
            int x = Integer.parseInt(xs[0]);
            char s = xs[1].charAt(0);

            pos[x] = s; 

            start = (x < start) ? x : start;
            end = (x > end) ? x : end;
        }

        int max = 0;
        for (int i = start; i <= end; i++) {
            int score = 0;
            for (int j = i; j <= i + k; j++) {
                if (pos[j] == 'G') score += 1;
                if (pos[j] == 'H') score += 2;
            }
            max = (score > max) ? score : max;
        }
        System.out.print(max);
    }
}