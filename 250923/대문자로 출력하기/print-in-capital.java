import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char c_lar = str.charAt(i);
            char c_sml = (char)(str.charAt(i) - 'a' + 'A');
            if (c_lar >= 'A' && c_lar <= 'Z') res += c_lar;
            else if (c_lar >= 'a' && c_lar <= 'z') res += c_sml;
        }
        bw.write(res);
        bw.flush();
        bw.close();
    }
}