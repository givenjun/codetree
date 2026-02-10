import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] matrix = new int[n][n];
        int[] maxList = new int[n];

        for (int i = 0; i < n; i++) {
            String[] rows = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(rows[j]);
            }
        }
      
        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < n - 2; j++) {
                int cnt = 0;
                for (int k = 0; k < 3; k++) {
                    if (matrix[i][j + k] == 1) cnt++;
                }
                max = (cnt > max) ? cnt : max;
            }
            maxList[i] = max;
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (maxList[j] > maxList[j + 1]) {
                    int tmp = maxList[j];
                    maxList[j] = maxList[j + 1];
                    maxList[j + 1] = tmp; 
                }
            }
        }
        
        System.out.print(maxList[n - 1] + maxList[n - 2]);
    }
}