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
      
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 2; j++) {
                int grid1 = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2];
                for (int y = 0; y < n; y++) {
                    for (int x = 0; x < n - 2; x++) {
                        if (i == y && (j == x) || (j == x - 1) || (j == x - 2) || (j == x + 1) || (j == x + 2)) continue;

                        int grid2 = matrix[y][x] + matrix[y][x + 1] + matrix[y][x + 2];
                        
                        
                        if ((grid1 + grid2) > ans) {
                            ans = (grid1 + grid2);
                            // System.out.println(i + ", " + j + " ~ " + (j + 2) + " | " + y + ", " + x + " ~ " + (x + 2) + " = " + ans);
                        }
                    }
                }

            }
        }

        System.out.print(ans);
    }
}