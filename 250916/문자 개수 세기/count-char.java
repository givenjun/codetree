import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String c_str = br.readLine();
        char c = c_str.charAt(0);
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) cnt++;
        }

        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}