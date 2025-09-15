import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String[] nm = br.readLine().split(" ");
        int N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);
        int val = 1;
        int cnt = 0;

        int[][] arr = new int[N][M];

        int x = 0;
        int y = 0;
        for (int i = 0; i < N + M - 1; i++) {
            x = (i >= M) ? M - 1 : i;
            if (i >= M) cnt++;
            for (int j = cnt; j < N; j++) {
                y = j;
                arr[y][x] = val;
                x--;
                val++;
                if (x < 0) break;
                if (y > N) break;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                bw.write(arr[i][j] + " ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}