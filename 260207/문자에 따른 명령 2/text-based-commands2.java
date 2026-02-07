import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0, y = 0;
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        String[] command = br.readLine().split("");

        int foward = 0;
        for (int i = 0; i < command.length; i++) {
            if (command[i].equals("L")) {
                foward = (foward - 1 + 4) % 4;
            }
            else if (command[i].equals("R")) { 
                foward = (foward + 1) % 4;
            }
            else {
                x += dx[foward];
                y += dy[foward];
            }
        }
        System.out.print(x + " " + y);
    }   
}