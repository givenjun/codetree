import java.io.*;

public class Main {
    public static int n, m;
    public static boolean inRange(int y, int x) {
        return (0 <= y && y < n && 0 <= x && x < m);
    } 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);
        char[][] matrix = new char[n][m];
        char alpha = 'A';
        matrix[0][0] = alpha;

        int x = 0, y = 0, d = 0;
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};

        int cnt = 0;
        while (cnt == n * m) {
            cnt++;
            aplha++;
            if (alpha = 'Z' + 1) {
                alpha = 'A';
            }
            int nextY = y + dy[d];
            int nextX = x + dx[d];
            if (!inRange(nextY, nextX) || matrix[nextY][nextX] != '\0') {
                d = (d + 1) % 4;
            }
            x += dx[d];
            y += dy[d];
            matrix[y][x] = alpha;
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