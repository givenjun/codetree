import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int p = N, pp = 1;

        bw.write(pp + " " + p + " ");

        while (true) {
            int num = pp + p;
            bw.write(num + " ");
            if (num >= 100) break;
            pp = p;
            p = num;
        }
        bw.flush();
        bw.close();
    }
}