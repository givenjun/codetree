import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(br.readLine());
        }

        String s = Integer.toString(sum);
        s = s.substring(1, s.length()) + s.substring(0, 1);

        bw.write(s);
        bw.flush();
        bw.close();
    }
}