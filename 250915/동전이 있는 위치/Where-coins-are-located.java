import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] size_coin = br.readLine().split(" ");
        int N = Integer.parseInt(size_coin[0]);
        int M = Integer.parseInt(size_coin[1]);
        int[][] arr = new int[N][N];

        for (int i = 0; i < M; i++) {
            String[] crd = br.readLine().split(" ");
            int y = Integer.parseInt(crd[0]) - 1;
            int x = Integer.parseInt(crd[1]) - 1;
            arr[y][x] = 1;
        }

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