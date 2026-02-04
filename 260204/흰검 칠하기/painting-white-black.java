import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        boolean[][] colorChk = new boolean[200001][2];
        int[][] grayChk = new int[200001][2];
        int idx = 100000;
        int min = 200001;
        int max = -1;

        for (int i = 0; i < n; i++) {
            if (idx > max) max = idx;
            if (idx < min) min = idx;

            String[] xSide = br.readLine().split(" ");
            int x = Integer.parseInt(xSide[0]);
            String side = xSide[1];

            if (side.equals("R")) {
                // System.out.print(idx + "~");
                for (int j = idx; j < idx + x; j++) {
                    colorChk[j][0] = false;
                    colorChk[j][1] = true;
                    grayChk[j][1]++;
                }
                // System.out.println(idx + x - 1);
                idx += (x - 1);
                
            }
            else {
                // System.out.print(idx + "~");
                for (int j = idx; j > idx - x; j--) {
                    colorChk[j][0] = true;
                    colorChk[j][1] = false;
                    grayChk[j][0]++;
                }
                // System.out.println(idx - x + 1);
                idx -= (x - 1);
            }   

            if (idx > max) max = idx;
            if (idx < min) min = idx;
        }
        // System.out.println("\n" + min + "~" + max + "\n");
        int black = 0;
        int white = 0;
        int gray = 0;

        for (int i = min; i <= max; i++) {
            if (grayChk[i][0] >= 2 && grayChk[i][1] >= 2) {
                gray++;
            }
            else {
                if (colorChk[i][0]) {
                    white++;
                }
                else if (colorChk[i][1]) {
                    black++;
                }
            }
            
            // System.out.println(grayChk[i][0] + " " + grayChk[i][1] + " -> " +  colorChk[i][0] + " " + colorChk[i][1]);
        }

        System.out.println(white + " " + black + " " + gray);
    }
}