import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int a = (int)str[0].charAt(0);
        int b = (int)str[1].charAt(0);
        int sum = a + b;
        int dif = ((a - b) > 0) ? a - b : b - a;

        bw.write(sum + " " + dif);
        bw.flush();
        bw.close();

    }
}