import java.io.*;

public class Main {
    public static int n;
    public static boolean inRange (int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};

        boolean[][] matrix = new boolean[n][n];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            String[] rc = br.readLine().split(" ");
            int r = Integer.parseInt(rc[0]) - 1;
            int c = Integer.parseInt(rc[1]) - 1;

            matrix[r][c] = true;
            int cnt = 0;
            for (int j = 0; j < 4; j++) {
                int x = c;
                int y = r;
                x += dx[j];
                y += dy[j];
                if (inRange(x, y) && matrix[y][x] == true) cnt++;
            }
            if (cnt == 3) bw.write("1\n"); else bw.write("0\n");
        }
        bw.flush();
        bw.close();
    }
}