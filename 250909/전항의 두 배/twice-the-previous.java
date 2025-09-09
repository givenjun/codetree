import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        bw.write(a + " " + b + " ");

        for (int i = 0; i < 8; i++) {
            int num = 2 * a + b;
            bw.write(num + " ");

            a = b;
            b = num;
        }
        bw.flush();
        bw.close();
    }
}