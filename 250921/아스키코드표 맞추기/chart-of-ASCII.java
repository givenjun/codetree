import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int len = str.length;
        char[] ch = new char[len];

        for (int i = 0; i < len; i++) {
            ch[i] = (char)Integer.parseInt(str[i]);
            bw.write(ch[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}