import java.io.*;

public class Main {
    public static int n, x, y, d = 0, sum;
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{-1, 0, 1, 0};
    public static int[][] matrix;
    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }
    public static void command(char c) {
        if (c == 'R') {
            d = (d + 1) % 4;
        }
        else if (c == 'L') {
            d = (d + 3) % 4;
        }
        else {
            int nextX = x + dx[d];
            int nextY = y + dy[d];
            if (inRange(nextX, nextY)) {
                x += dx[d];
                y += dy[d];
                sum += matrix[y][x];
            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nt = br.readLine().split(" ");
        n = Integer.parseInt(nt[0]);
        x = n / 2; 
        y = n / 2;
        matrix = new int[n][n];
        int t = Integer.parseInt(nt[1]);
        String cmdLine = br.readLine();

        for (int i = 0; i < n; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                // System.out.print(row[j] + " ");
                matrix[i][j] = Integer.parseInt(row[j]);
            }
            // System.out.println();
        }
        sum = matrix[y][x];

        for (int i = 0; i < t; i++) {
            char cmd = cmdLine.charAt(i);
            command(cmd);
            // System.out.print(cmd + " ");
        }
        System.out.print(sum);
    }
}