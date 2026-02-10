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
        char[][] matrix = new char[n][m];
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        int d;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                matrix[i][j] = str.charAt(j);
            }
        }

        int ans = 0;
        int x, y;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                d = 0;
                int d2 = d + 1;
                if (matrix[i][j] == 'L') {
                    for (int k = 0; k < 8; k++) {
                        y = i;
                        x = j;
                        if (k < 4) {
                            d = (d + 1) % 4;
                        }
                        else if (k >= 4) {
                            d2 = (d2 + 2) % 4;
                            if (k == 5) d = (d + 2) % 4;
                        }
                        int fx = dx[d];
                        int fy = (k < 4) ? dy[d] : dy[d2];

                        int cnt = 0;
                        for (int h = 0; h < 2; h++) {
                            x = x + fx;
                            y = y + fy;
                            if (inRange(x, y) && matrix[y][x] == 'E') {
                                cnt++;
                            }
                        }
                        if (cnt == 2) {
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.print(ans);
    }
}