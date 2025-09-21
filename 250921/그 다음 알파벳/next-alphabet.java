import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        char c = str.charAt(0);
        int res = (int)c + 1;
        if (res == 'z' + 1) res = 'a';

        bw.write((char)res + "");
        bw.flush();
        bw.close();
        
    }
}