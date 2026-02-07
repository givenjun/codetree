import java.io.*;

public class Main {
    public static int n, m;

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < m && 0 <= y && y < n);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        int[][] matrix = new int[n][m];
        int[] p = new int[]{0, 0};
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        int direction = 0;
        int cnt = 0;
        
        while (true) {
            if (cnt == n * m) break;
            cnt++;
            matrix[p[0]][p[1]] = cnt;
            
            p[0] += dy[direction];
            p[1] += dx[direction];

            if (!inRange(p[1], p[0]) || matrix[p[0]][p[1]] != 0) {
                p[0] -= dy[direction];
                p[1] -= dx[direction];
                direction = (direction + 1) % 4;
                p[0] += dy[direction];
                p[1] += dx[direction];
            }            
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}