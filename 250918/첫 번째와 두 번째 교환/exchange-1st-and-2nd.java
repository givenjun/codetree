import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String[] str = br.readLine().split("");
        char c1 = str[0].charAt(0);
        char c2 = str[1].charAt(0);
        String res = "";

        for (int i = 0; i < str.length; i++) {
            char c = str[i].charAt(0);
            if (c == c1) res += c2;
            else if (c == c2) res += c1;
            else res += c;
        }

        bw.write(res);
        bw.flush();
        bw.close();
    }
}