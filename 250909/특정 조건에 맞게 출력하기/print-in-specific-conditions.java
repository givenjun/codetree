import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        for (int i = 0; i < str.length; i++) {
            int n = Integer.parseInt(str[i]);

            if (n == 0) break;
            if (n % 2 == 0) n = n / 2;
            else n = n + 3;

            bw.write(n + " ");
        }
        bw.flush();
        bw.close();
    }
}