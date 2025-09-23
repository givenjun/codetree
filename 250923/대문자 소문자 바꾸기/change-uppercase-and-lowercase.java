import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') res += (char)(c - 'a' + 'A');
            else if (c >= 'A' && c <= 'Z') res += (char)(c - 'A' + 'a');
        }

        bw.write(res);
        bw.flush();
        bw.close();

    }
}