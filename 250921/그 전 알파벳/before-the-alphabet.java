import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int i = (int)s.charAt(0) - 1;
        char c = (char)i;
        if (i == 'a' - 1) c = 'z';

        bw.write(c + "");
        bw.flush();
        bw.close();

    }
}