import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        String s1 = str[0];
        String s2 = str[1];
        int s1_len = str[0].length();
        int s2_len = str[1].length();

        if (s1_len >= 2) {
            bw.write((char)Integer.parseInt(str[0]) + " ");
        }
        else {
            bw.write((int)(str[0].charAt(0)) + " ");
        }
        if (s2_len >= 2) {
            bw.write((char)Integer.parseInt(str[1]));
        }
        else {
            bw.write((int)(str[1].charAt(0)));
        }
        bw.flush();
        bw.close();
    }
}