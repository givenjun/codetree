import java.io.*;

public class Main {

    public static int n;

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nt = br.readLine().split(" ");
        n = Integer.parseInt(nt[0]);
        int t = Integer.parseInt(nt[1]);
        String[] rcd = br.readLine().split(" ");
        int r = Integer.parseInt(rcd[0]) - 1;
        int c = Integer.parseInt(rcd[1]) - 1;
        String direction = "URLD";
        String d = rcd[2];

        int foward = direction.indexOf(d);

        int[][] matrix = new int[n][n];

        int[] dx = new int[]{0, 1, -1, 0}; // 1 -> 2, 2 -> 1
        int[] dy = new int[]{-1, 0, 0, 1}; // 0 -> 3, 3 -> 0;
        
        // System.out.println("0초 : " + (r) + " " + (c));
        for (int i = 0; i < t; i++) {
            
            c += dx[foward];
            r += dy[foward];

            if (!inRange(r, c)) {
                foward = 3 - foward;
                c += dx[foward];
                r += dy[foward];
            }
            // System.out.println(i + 1 + "초 : " + (r) + " " + (c));
        }

        System.out.print((r + 1) + " " + (c + 1));
    }
}