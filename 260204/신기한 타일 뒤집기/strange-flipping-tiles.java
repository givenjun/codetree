import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        boolean[][] tile = new boolean[200001][2]; 
        int pos = 100000;

        for (int i = 0; i < n; i++) {
            String[] xSide = br.readLine().split(" ");
            int x = Integer.parseInt(xSide[0]);
            String side = xSide[1];

            if (side.equals("R")) {
                for (int j = pos; j < pos + x; j++) {
                    tile[j][0] = false;
                    tile[j][1] = true;
                }
                pos = pos + x - 1;
            }
            else {
                for (int j = pos; j > pos - x; j--) {
                    tile[j][0] = true;
                    tile[j][1] = false;
                }
                pos = pos - x + 1;
            }
        }

        int black = 0;
        int white = 0;

        for (int i = 0; i < 200001; i++) {
            if (!tile[i][0] && !tile[i][1]) continue;

            if (tile[i][0]) {
                white++;
            }
            else if (tile[i][1]) {
                black++;
            }
        }

        System.out.println(white + " " + black);
    }
}