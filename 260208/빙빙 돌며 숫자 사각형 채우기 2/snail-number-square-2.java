import java.io.*;

public class Main {
    public static int n, m;
    public static boolean inRange (int y, int x) {
        return (0 <= y && y < n && 0 <= x && x < m);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        int[][] matrix = new int[n][m];
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int x = 0, y = 0, d = 0;
        int val = 1;

        matrix[0][0] = val;
        while (val != n * m) {
            val++;
            int nextY = y + dy[d];
            int nextX = x + dx[d];
            // System.out.println(d +": "+val+" " +nextY + " " + nextX);
            if (!inRange(nextY, nextX) || matrix[nextY][nextX] != 0) {
                d = (d + 1) % 4;
            }
            y += dy[d];
            x += dx[d];
            matrix[y][x] = val;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                bw.write(matrix[i][j] + " ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}