import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s1 = br.readLine();
        String s2 = br.readLine();
        String init = s1;
        int cnt = 0;

        while (true) {
            cnt++;
            s1 = s1.substring(s1.length() - 1, s1.length()) + s1.substring(0, s1.length() - 1);
            if (s1.equals(s2)) break;
            if (s1.equals(init)) {
                cnt = -1;
                break;
            }
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}