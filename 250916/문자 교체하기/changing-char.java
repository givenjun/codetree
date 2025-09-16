import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        String sub1 = str[0].substring(0, 2);
        String sub2 = str[1].substring(2, str[1].length());
        String res = sub1 + sub2;

        bw.write(res);
        bw.flush();
        bw.close();

    }
}