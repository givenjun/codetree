import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = 0, y = 0;
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        String enws = "ENWS";

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] fowardDistance = br.readLine().split(" ");
            int foward = enws.indexOf(fowardDistance[0]);
            int distance = Integer.parseInt(fowardDistance[1]);

            x += dx[foward] * distance;
            y += dy[foward] * distance;
        }

        System.out.print(x + " " + y);
    }
}