import java.io.*;

public class Main {
    public static boolean inRange (int y, int x, int n) {
        return (0 <= y && y < n && 0 <= x && x < n);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] rows = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(rows[j]);
            }
        }

        // 입력 행렬 확인
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cnt = 0;
                if (inRange(i, j - 1, n) && inRange(i, j + 1, n)) {
                    if (matrix[i][j] == 1) cnt++;
                    if (matrix[i][j - 1] == 1) cnt++;
                    if (matrix[i][j + 1] == 1) cnt++;
                }
                if (cnt > max) max = cnt;
            }
        }
        System.out.print(max);
        
        
    }
}