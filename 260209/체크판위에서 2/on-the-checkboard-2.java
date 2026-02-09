import java.io.*;

public class Main {
    public static int r, c;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] rc = br.readLine().split(" "); 
        r = Integer.parseInt(rc[0]);
        c = Integer.parseInt(rc[1]);
        char[][] plate = new char[r][c];

        for (int i = 0; i < r; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < c; j++) {
                plate[i][j] = row[j].charAt(0);
            }
        }

        // //입력 행렬 확인
        // for (int i = 0; i < r; i++) {
        //     for (int j = 0; j < c; j++) {
        //         System.out.print(plate[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        char start = plate[0][0];
        char end = plate[r - 1][c - 1];

        int cnt = 0;
        for (int i = 1; i < r - 1; i++) {
            for (int j = 1; j < c - 1; j++) {
                if (plate[i][j] != start) {
                    // System.out.println(i + " " + j + "\n");
                    int midY = i;
                    int midX = j;
                    for (int y = midY + 1; y < r - 1; y++) {
                        for (int x = midX + 1; x < c - 1; x++) {
                            // System.out.println(y + " " + x);
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}