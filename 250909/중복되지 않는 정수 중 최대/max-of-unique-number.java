import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int res = 0;

        for (int i = 0; i < N; i++) {
            int max = Integer.parseInt(str[0]);
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(str[j]);
                max = (max > num) ? max : num;
            }
            int cnt = 0;
            // bw.write(max + "=>");
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(str[j]);
                // bw.write(str[j] + " ");
                if (max == num) { str[j] = "-1"; cnt++; }
            }
            if (cnt == 1) { res = max; break;}
            if (cnt == N) { res = -1; break;}
            // bw.newLine();
        }
        bw.write(res + "");
        bw.flush();
        bw.close();
    }
}