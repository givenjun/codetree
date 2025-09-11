import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] arr3 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] ele = br.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = Integer.parseInt(ele[j]);
            }
        }
        for (int i = 0; i < 4; i++) {
            String[] ele = br.readLine().split(" ");
            if (i == 0) continue;
            for (int j = 0; j < 3; j++) {
                int n = Integer.parseInt(ele[j]);
                arr3[i - 1][j] = arr1[i - 1][j] * n;
                bw.write(arr3[i - 1][j] + " ");
            }
            bw.newLine();
        }
        bw.flush();      
        bw.close();
    }
}