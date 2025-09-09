import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        while (true) {
            int max = Integer.parseInt(str[0]);
            for (int i = 0; i < N; i++) {
                int num = Integer.parseInt(str[i]);
                max = (max > num) ? max : num;
            }
            for (int i = 0; i < N; i++) {
                int num = Integer.parseInt(str[i]);
                if (num == max) {
                    N = i;
                    bw.write((N + 1) + " "); 
                    break;
                }
            }
            if (N == 0) {
                break;
            }
        }
        bw.flush();
        bw.close(); 
    }
}