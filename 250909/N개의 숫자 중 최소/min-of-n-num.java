import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine().replace(" ", ""));

        String[] str = br.readLine().split(" ");

        int min = Integer.parseInt(str[0]);
        int cnt = 0;

        for (int i = 1; i < N; i++) {
            int num = Integer.parseInt(str[i]);
            min = (min < num) ? min : num;
        }
        for (String s : str) {
            if (s.equals(min+"")) cnt++;
        }

        bw.write(min + " " + cnt);
        bw.flush();
        bw.close();
    }
}