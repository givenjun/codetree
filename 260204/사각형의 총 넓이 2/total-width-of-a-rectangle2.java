import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        boolean[][] plane = new boolean[201][201];

        for (int i = 0; i < n; i++) {
            String[] points = br.readLine().split(" ");
            int x1 = Integer.parseInt(points[0]) + 100;
            int y1 = Integer.parseInt(points[1]) + 100;
            int x2 = Integer.parseInt(points[2]) + 100;
            int y2 = Integer.parseInt(points[3]) + 100;

            for (int j = y1; j < y2; j++) {
                for (int k = x1; k < x2; k++) {
                    plane[j][k] = true;
                }
            }
        }

        int size = 0;
        for (int i = 0; i < 201; i++) {
            for (int j = 0; j < 201; j++) {
                if (plane[i][j]) size++;
            }
        }

        System.out.println(size);
    }
}