import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int x = 0, y = 0;
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        String direction = "ESWN";
        int foward;
        int distance;
        int time = 0;
        boolean cond = false;

        for (int i = 0; i < n; i++) {
            if (cond) break;

            String[] fd = br.readLine().split(" ");
            foward = direction.indexOf(fd[0]);
            distance = Integer.parseInt(fd[1]);

            for (int j = 0; j < distance; j++) {
                time++;

                x += dx[foward];
                y += dy[foward];

                if (x == 0 && y == 0) {
                    cond = true;   
                    break;
                }
                // System.out.println(x + " " + y);
            }
            
        }

        if (cond)
            System.out.print(time);
        else 
            System.out.print(-1);
    }
}