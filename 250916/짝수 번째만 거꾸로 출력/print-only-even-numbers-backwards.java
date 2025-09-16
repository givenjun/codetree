import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split("");
        int len = str.length;
        int init = (len % 2 == 0) ? len : len - 1;

        for (int i = init - 1; i >= 0; i -= 2) {
            bw.write(str[i]);
        }
        bw.flush();
        bw.close();
    }
}