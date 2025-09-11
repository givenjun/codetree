import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[4][4];
        int sum = 0;
        int cnt = 4;

        for (int i = 0; i < 4; i++) {
            String[] list = br.readLine().split(" ");
            for (int j = 0; j < 4; j++) {
                int n = Integer.parseInt(list[j]);
                if (j <= 4 - cnt) sum += n;
            }
            cnt--;
        }
        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}