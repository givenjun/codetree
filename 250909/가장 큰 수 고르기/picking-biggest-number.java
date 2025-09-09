import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int max = Integer.parseInt(str[0]);
        for (int i = 1; i < 10; i++) {
            int num = Integer.parseInt(str[i]);
            max = (num > max) ? num : max;
        }

        bw.write(max + "");
        bw.flush();
        bw.close();

    }
}