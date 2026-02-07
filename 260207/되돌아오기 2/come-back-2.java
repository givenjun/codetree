import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = 0, y = 0;
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int direction = 0;
        String command = br.readLine();
        int len = command.length();
        int time = 0;
        int ans = -1;

        for (int i = 0; i < len; i++) {
            char c = command.charAt(i);

            if (c == 'L') {
                direction = (direction + 3) % 4;
                time++;
            }
            if (c == 'R') {
                direction = (direction + 1) % 4;
                time++;
            }
            else {
                x += dx[direction];
                y += dy[direction];
                time++;
                // System.out.println(x +" "+y);
                if (x == 0 && y == 0) {
                    ans = time;
                    break;
                }
            }
        }
        System.out.print(ans);
    }
}