import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[][] arr = new int[2][2000001];

        int time1 = 1, time2 = 1;
        for (int i = 0; i < n; i++) {
            String[] td = br.readLine().split(" ");
            int t = Integer.parseInt(td[0]);
            String d = td[1];

            for (int j = 0; j < t; j++) {
                if (d.equals("R")) {
                    arr[0][time1] = arr[0][time1 - 1] + 1;
                }
                else {
                    arr[0][time1] = arr[0][time1 - 1] - 1;
                }
                time1++;
            }
        }

        for (int i = 0; i < m; i++) {
            String[] td = br.readLine().split(" ");
            int t = Integer.parseInt(td[0]);
            String d = td[1];

            for (int j = 0; j < t; j++) {
                if (d.equals("R")) {
                    arr[1][time2] = arr[1][time2 - 1] + 1;
                }
                else {
                    arr[1][time2] = arr[1][time2 - 1] - 1;
                }
                time2++;
            }
        }

        int time = (time1 >= time2) ? time1 : time2;

        while (time1 <= time && time2 <= time) {
            if (time1 < time) {
                arr[0][time1] = arr[0][time1 - 1];
                time1++;
            }
            else {
                arr[1][time2] = arr[1][time2 - 1];
                time2++;
            }
        }

        int ans = 0;
        for (int i = 1; i < time; i++) {
            // System.out.println(i + "->" + arr[0][i] + " " + arr[1][i]);

            boolean cond1 = (arr[0][i] != arr[0][i - 1]) ? true : false;
            boolean cond2 = (arr[1][i] != arr[1][i - 1]) ? true : false;
            boolean cond3 = (arr[0][i] == arr[1][i]) ? true : false;
            boolean cond4 = (arr[0][i - 1] == arr[1][i - 1]) ? true : false;
            if (cond1 || cond2) {
                if (cond3) {
                    if (cond4) {
                        continue;
                    }
                    else {
                        ans++;
                    }
                }
            }
        }

        System.out.print(ans);
    }
}