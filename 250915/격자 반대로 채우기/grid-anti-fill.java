import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        int val = N;
        int v = 1;

        for (int i = N - 1; i >= 0; i--) {
            v *= -1;
            for (int j = 0; j < N; j++) {
                arr[j][i] = val;
                val += v;
            }
            val += N - v;
        }

        int cnt = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                bw.write(arr[i][j] + " ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}