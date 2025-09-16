import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int sum = 0;

        for (int i = 0; i < str.length; i++) {
            sum += str[i].length();
        }
        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}