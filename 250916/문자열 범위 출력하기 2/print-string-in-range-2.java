import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] spl = str.split("");
        String res = "";
        int N = Integer.parseInt(br.readLine());
        int len = str.length();
        if (N > len) res = str;
        else {
            for (int i = len - 1; i >= len - N; i--) {
                res += spl[i];
            }
        }
        bw.write(res);
        bw.flush();
        bw.close();
    }
}