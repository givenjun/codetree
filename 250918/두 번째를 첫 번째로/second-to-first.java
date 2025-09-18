import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] s = str.split("");
        String change = s[0];
        String search = s[1];
        str = str.replace(search, change);

        bw.write(str);
        bw.flush();
        bw.close();

    }
}