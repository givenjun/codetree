import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[][] list = new int[1000001][2];
        int[][] rank = new int[1000001][2];

        int time1 = 1, time2 = 1;
        for (int i = 0; i < n; i++) {
            String[] vt = br.readLine().split(" ");
            int v = Integer.parseInt(vt[0]);
            int t = Integer.parseInt(vt[1]);

            for (int j = 0; j < t; j++) {
                list[time1][0] = v + list[time1 - 1][0];
                time1++;
            }
        }
        for (int i = 0; i < m; i++) {
            String[] vt = br.readLine().split(" ");
            int v = Integer.parseInt(vt[0]);
            int t = Integer.parseInt(vt[1]);

            for (int j = 0; j < t; j++) {
                list[time2][1] = v + list[time2 - 1][1];
                time2++;
            }
        }

        int cnt = 0;
        for (int i = 0; i < time1; i++) {
            // System.out.println(list[i][0] + " " + list[i][1]);
            if (list[i][0] > list[i][1]) {
                rank[i][0] = 1;
                rank[i][1] = 0;
            }
            else if (list[i][0] < list[i][1]) {
                rank[i][0] = 0;
                rank[i][1] = 1;
            }
            else {
                rank[i][0] = 1;
                rank[i][1] = 1;
            }

            if (i > 0) {
                if (rank[i - 1][0] != rank[i][0] || rank[i -1][1] != rank[i][1]) cnt++;
            }
        }
        System.out.print(cnt);
    }
}