import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String s1 = br.readLine().replace(" ", "");
        String s2 = br.readLine().replace(" ", "");
        String s = s1 + s2;

        bw.write(s);
        bw.flush();
        bw.close();
    }
}