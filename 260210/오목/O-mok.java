import java.io.*;

public class Main {
    public static boolean inRange(int y, int x) {
        return (0 <= y && y < 19 && 0 <= x && x < 19);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] plate = new int[19][19];
        int[][] black;
        int[][] white;

        int lenB = 0;
        int lenW = 0;
        for (int i = 0; i < 19; i++) {
            String[] rows = br.readLine().split(" ");
            for (int j = 0; j < 19; j++) {
                plate[i][j] = Integer.parseInt(rows[j]);
                if (plate[i][j] == 1) lenB++;
                if (plate[i][j] == 2) lenW++;
            }
        }
        black = new int[lenB][2];
        int idxB = 0;
        white = new int[lenW][2];
        int idxW = 0;
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (plate[i][j] == 1) {
                    black[idxB][0] = i;
                    black[idxB][1] = j;
                    idxB++;
                }
                if (plate[i][j] == 2) {
                    white[idxW][0] = i;
                    white[idxW][1] = j;
                    idxW++;
                }
            }
        }

        int winner = 0;
        int midY = 0, midX = 0;
        for (int i = 0; i < lenB; i++) {
            // System.out.println(black[i][0] + " " + black[i][1]);
            if (inRange(black[i][0], black[i][1] + 4)) {
                int cnt = 0;
                for (int j = 0; j < 5; j++) {
                    if (plate[black[i][0]][black[i][1] + j] == 1) cnt++;
                }
                if (cnt == 5) {
                    winner = 1;
                    midY = black[i][0];
                    midX = black[i][1] + 2;
                }
            }
            if (inRange(black[i][0] + 4, black[i][1])) {
                int cnt = 0;
                for (int j = 0; j < 5; j++) {
                    if (plate[black[i][0] + j][black[i][1]] == 1) cnt++;
                }
                if (cnt == 5) {
                    winner = 1;
                    midY = black[i][0] + 2;
                    midX = black[i][1];
                }
            }
            if (inRange(black[i][0] + 4, black[i][1] + 4)) {
                int cnt = 0;
                for (int j = 0; j < 5; j++) {
                    if (plate[black[i][0] + j][black[i][1] + j] == 1) cnt++;
                }
                if (cnt == 5) {
                    winner = 1;
                    midY = black[i][0] + 2;
                    midX = black[i][1] + 2;
                }
            }
            if (inRange(black[i][0] + 4, black[i][1] - 4)) {
                int cnt = 0;
                for (int j = 0; j < 5; j++) {
                    if (plate[black[i][0] + j][black[i][1] - j] == 1) cnt++;
                }
                if (cnt == 5) {
                    winner = 1;
                    midY = black[i][0] + 2;
                    midX = black[i][1] - 2;
                }
            }
        }
        // System.out.println();
        for (int i = 0; i < lenW; i++) {
            // System.out.println(white[i][0] + " " + white[i][1]);
            if (inRange(white[i][0], white[i][1] + 4)) {
                int cnt = 0;
                for (int j = 0; j < 5; j++) {
                    if (plate[white[i][0]][white[i][1] + j] == 2) cnt++;
                }
                if (cnt == 5) {
                    winner = 2;
                    midY = white[i][0];
                    midX = white[i][1] + 2;
                }
            }
            if (inRange(white[i][0] + 4, white[i][1])) {
                int cnt = 0;
                for (int j = 0; j < 5; j++) {
                    if (plate[white[i][0] + j][white[i][1]] == 2) cnt++;
                }
                if (cnt == 5) {
                    winner = 2;
                    midY = white[i][0] + 2;
                    midX = white[i][1];
                }
            }
            if (inRange(white[i][0] + 4, white[i][1] + 4)) {
                int cnt = 0;
                for (int j = 0; j < 5; j++) {
                    if (plate[white[i][0] + j][white[i][1] + j] == 2) cnt++;
                }
                if (cnt == 5) {
                    winner = 2;
                    midY = white[i][0] + 2;
                    midX = white[i][1] + 2;
                }
            }
            if (inRange(white[i][0] + 4, white[i][1] - 4)) {
                int cnt = 0;
                for (int j = 0; j < 5; j++) {
                    if (plate[white[i][0] + j][white[i][1] - j] == 2) cnt++;
                }
                if (cnt == 5) {
                    winner = 2;
                    midY = white[i][0] + 2;
                    midX = white[i][1] - 2;
                }
            }
        }

        System.out.println(winner);
        System.out.println((midY + 1) + " " + (midX + 1));
    }
}