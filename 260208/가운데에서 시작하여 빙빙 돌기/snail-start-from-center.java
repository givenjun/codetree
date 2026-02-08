import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] matrix = new int[n][n];
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};
        int x = n / 2, y = n / 2;
        int direction = 0;
        int distance = 1;
        int cnt = 1;
        matrix[y][x] = 1;
        while (cnt != n * n) {

            if (distance != n - 1) {
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < distance; j++) {
                        cnt++;
                        x += dx[direction];
                        y += dy[direction];
                        // System.out.println(cnt + " " + y + " " + x);
                        matrix[y][x] = cnt;
                    }
                    direction = (direction + 1) % 4;
                }
            }
            else {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < distance; j++) {
                        cnt++;
                        x += dx[direction];
                        y += dy[direction];
                        // System.out.println(cnt + " " + y + " " + x);
                        matrix[y][x] = cnt;
                    }
                    direction = (direction + 1) % 4;
                }
            }
            distance ++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(matrix[i][j] + " ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}