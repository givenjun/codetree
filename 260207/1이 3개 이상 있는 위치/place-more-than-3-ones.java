import java.io.*;

public class Main {
    public static int n;
    public static boolean matrixIn(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        String[][] matrix = new String[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i] = br.readLine().split(" ");
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cnt = 0;
                if (matrixIn(j, i - 1) && matrix[i - 1][j].equals("1")) cnt++; 
                if (matrixIn(j, i + 1) && matrix[i + 1][j].equals("1")) cnt++; 
                if (matrixIn(j - 1, i) && matrix[i][j - 1].equals("1")) cnt++; 
                if (matrixIn(j + 1, i) && matrix[i][j + 1].equals("1")) cnt++; 
                if (cnt >= 3) ans++;
            }
        }
        System.out.print(ans);
    }
}