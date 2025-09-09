import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        String[] s = br.readLine().split(" ");
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(s[i]) == M) cnt++;
        }

        bw.write(cnt+"");
        bw.flush();
        bw.close();

    }
}