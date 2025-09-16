import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = new String[4];
        for (int i = 0; i < 4; i++) {
            str[i] = br.readLine();
        }
        for (int i = 3; i >= 0; i--) {
            bw.write(str[i] + "\n");
        }
        bw.flush();
        bw.close();
        
    }
}