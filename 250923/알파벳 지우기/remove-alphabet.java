import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s1 = br.readLine();
        int n1 = del_alpha(s1);
        String s2 = br.readLine();
        int n2 = del_alpha(s2);

        bw.write(n1 + n2 + "");
        bw.flush();
        bw.close();
    }
    public static int del_alpha(String s) {
        String num = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') num += c;
        }
        int res = Integer.parseInt(num);
        return res;
    }
}