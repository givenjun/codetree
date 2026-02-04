import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] rect = new boolean[2001][2001];

        for (int i = 0; i < 2; i++) {
            String[] points = br.readLine().split(" ");
            int x1 = Integer.parseInt(points[0]) + 1000;
            int y1 = Integer.parseInt(points[1]) + 1000;
            int x2 = Integer.parseInt(points[2]) + 1000;
            int y2 = Integer.parseInt(points[3]) + 1000;

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    if (i == 0) rect[x][y] = true;
                    else rect[x][y] = false;
                }
            }
        }

        int area = 0;
        int[] start = new int[]{2001, 2001};
        int[] end = new int[]{-1, -1};

        for (int i = 0; i < 2001; i++) {
            for (int j = 0; j < 2001; j++) {
                if (rect[i][j] == true) {
                    if (i < start[0]) start[0] = i;
                    if (j < start[1]) start[1] = j;
                    if (i > end[0]) end[0] = i + 1;
                    if (j > end[1]) end[1] = j + 1;
                }
            }
        }
        // System.out.println(start[0] + " " + start[1]);
        // System.out.println(end[0] + " " + end[1]);

        area = (end[0] - start[0]) * (end[1] - start[1]);

        System.out.print(area);
    }
}