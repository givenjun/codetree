import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        boolean[][] rect = new boolean[201][201];

        for (int i = 0; i < n; i++) {
            String[] points = br.readLine().split(" ");
            int x1 = Integer.parseInt(points[0]) + 100;
            int y1 = Integer.parseInt(points[1]) + 100;
            int x2 = x1 + 8;
            int y2 = y1 + 8;
            x1 = (x1 <= -1) ? 0 : x1;
            y1 = (y1 <= -1) ? 0 : y1;
            x2 = (x2 >= 201) ? 201 : x2;
            y2 = (y2 >= 201) ? 201 : y2;

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    rect[j][k] = true;
                }
            }
        }

        int area = 0;
        for (int j = 0; j < 201; j++) {
            for (int k = 0; k < 201; k++) {
                if (rect[j][k]) area++;
            }
        }  
        System.out.print(area);

    }
}