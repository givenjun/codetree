import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 1; i >= 0; i++) {
            int num = N * i;
            bw.write(num + " ");
            if (num % 5 == 0) cnt++;
            if (cnt >= 2) break;
        }
        bw.flush();
        bw.close();
    }
}