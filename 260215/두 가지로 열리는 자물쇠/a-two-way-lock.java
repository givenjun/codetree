import java.io.*;
import java.lang.*;

public class Main {
    public static int n;
    public static boolean inRange(int pattern, int num) {
        int diff = Math.abs(pattern - num);
        return diff <= 2 || diff >= n - 2;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        int[] a = new int[3];
        int[] b = new int[3];
        String[] strA = br.readLine().split(" ");
        String[] strB = br.readLine().split(" ");

        for (int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(strA[i]);
        }
        for (int i = 0; i < 3; i++) {
            b[i] = Integer.parseInt(strB[i]);
        }

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    boolean firstA = inRange(a[0], i);
                    boolean secondA = inRange(a[1], j);
                    boolean thirdA = inRange(a[2], k);
                    boolean firstB = inRange(b[0], i);
                    boolean secondB = inRange(b[1], j);
                    boolean thirdB = inRange(b[2], k);

                    if ((firstA && secondA && thirdA) || (firstB && secondB && thirdB)) cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}