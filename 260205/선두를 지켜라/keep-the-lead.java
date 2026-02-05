import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[][] arr = new int[2][1000001];

        int pos1 = 1, pos2 = 1;
        int time1 = 0, time2 = 0;
        for (int i = 0; i < n; i++) {
            String[] vt = br.readLine().split(" ");
            int v = Integer.parseInt(vt[0]);
            int t = Integer.parseInt(vt[1]);

            for (int j = 0; j < t; j++) {
                arr[0][pos1] = v + arr[0][pos1 - 1];
                pos1++;
            }
            time1 = pos1;
        }

        for (int i = 0; i < m; i++) {
            String[] vt = br.readLine().split(" ");
            int v = Integer.parseInt(vt[0]);
            int t = Integer.parseInt(vt[1]);

            for (int j = 0; j < t; j++) {
                arr[1][pos2] = v + arr[1][pos2 - 1];
                pos2++;
            }
            time2 = pos2;
        }

        int cnt = 0;
        boolean firstN = false;
        boolean firstM = false;

        for (int i = 0; i < time1; i++) {
            // System.out.print(arr[0][i] + " " + arr[1][i] + " ");
            if (!firstN && !firstM) {
                if (arr[0][i] > arr[1][i]) {
                    firstN = true;
                    cnt++;
                    // System.out.print("O");
                }
                if (arr[0][i] < arr[1][i]) {
                    firstM = true;
                    cnt++;
                    // System.out.print("O");
                }
            }
            if (firstN && !firstM) {
                if (arr[0][i] < arr[1][i]) {
                    firstN = false;
                    firstM = true;
                    cnt++;
                    // System.out.print("O");
                }
            }
            if (!firstN && firstM) {
                if (arr[0][i] > arr[1][i]) {
                    firstN = true;
                    firstM = false;
                    cnt++;
                    // System.out.print("O");
                }
            }
            // System.out.println();
        }
        System.out.print(cnt - 1);
    }
}