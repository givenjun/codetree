import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int sum = a + b;
        String ab = Integer.toString(sum);
        int cnt = 0;

        for (int i = 0; i < ab.length(); i++) {
            char c = ab.charAt(i);
            if (c == '1') cnt++;
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();

    }
}