import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String str = br.readLine();
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == 1 || i == str.length() - 2) res += 'a';
            else res += str.charAt(i);
        }
        bw.write(res);
        bw.flush();
        bw.close();
    }
}