import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        arr[0][0] = 1;

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i + 1; j++) {
                int fir = 0;
                int sec = 0;
                if (i - 1 >= 0 && j - 1 >= 0) fir = arr[i - 1][j - 1];
                arr[i][j] += fir; 
                if (i - 1 >= 0 && j >= 0) sec = arr[i - 1][j]; 
                arr[i][j] += sec;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] > 0) bw.write(arr[i][j] + " ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}