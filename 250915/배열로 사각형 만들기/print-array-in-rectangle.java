import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // Please write your code here.
        int[][] arr = new int[5][5];

        int add = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = 1;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i - 1 < 0 || j - 1 < 0) continue;
                arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
            }
        } 
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                bw.write(arr[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}