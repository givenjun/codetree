import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String str = "";

        String[] num = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(num[i]);
            if (n % 2 == 0) str += n + " ";
        }

        String[] rev = str.split(" ");
        for (int i = rev.length - 1; i >= 0; i--) {
            bw.write(rev[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}