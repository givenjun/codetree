import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String str = br.readLine();
        String res = "";

        for (int i = 1; i < str.length(); i++) {
            res += str.charAt(i);
        }
        res += str.charAt(0);

        bw.write(res);
        bw.flush();
        bw.close();
    }
}