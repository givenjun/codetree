import java.io.*;

public class Main {
    public static int n;
    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }
    public static int rotateL (int d) {
        return (d + 3) % 4;
    }
    public static int rotateR (int d) {
        return (d + 1) % 4;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        char[][] mirror = new char[n][n];
        int[] dx = new int[]{0, -1, 0, 1};
        int[] dy = new int[]{1, 0, -1, 0};
        int x = 0, y = 0;
        int direction;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                mirror[i][j] = str.charAt(j);
            }
        }
        int k = Integer.parseInt(br.readLine());

        if (k <= n) direction = 0;
        else if (k <= 2 * n) direction = 1;
        else if (k <= 3 * n) direction = 2;
        else direction = 3;

        int east = 3;
        int val = 1;
        while (val != k) {
            if (!inRange(x, y)) {
                x -= dx[east];
                y -= dy[east];
                east = rotateR(east);
            }
            else {
                x += dx[east];
                y += dy[east];
                val++;   
            }
        }
        
        int cnt = 0;

        while (inRange(x, y)) {
            if (mirror[y][x] == '/') {
                if (direction == 1 || direction == 3) {
                    direction = rotateL(direction);
                }
                else {
                    direction = rotateR(direction);
                }
                cnt++;
            }
            else {
                if (direction == 1 || direction == 3) {
                    direction = rotateR(direction);
                }
                else {
                    direction = rotateL(direction);
                }
                cnt++;
            }
            x += dx[direction];
            y += dy[direction];
            // System.out.println(cnt +": "+y + " " + x);
        }
        System.out.println(cnt);
    }
}