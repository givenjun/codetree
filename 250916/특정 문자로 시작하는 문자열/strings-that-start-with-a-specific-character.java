import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int sum = 0;
        double avg = 0;

        String[] str = new String[N + 1];
        for (int i = 0; i < N + 1; i++) {
            str[i] = br.readLine();
        }

        char c = str[N].charAt(0);
        for (int i = 0; i < N; i++) {
            if (str[i].charAt(0) == c) {
                cnt++;
                sum += str[i].length();
            }
        }
        avg = sum / cnt;
        String s_avg = String.format("%.2f", avg);

        bw.write(cnt + " " + s_avg);
        bw.flush();
        bw.close();

    }
}