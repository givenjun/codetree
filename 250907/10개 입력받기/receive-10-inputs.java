import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int sum = 0;
        double avg = 0;
        int cnt = 10;

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("0")) { cnt = i; break; }
            sum += Integer.parseInt(str[i]);
        }
        avg = sum * 1.0 / cnt;
        String n = String.format("%.1f", avg);

        bw.write(sum + " " + n);
        bw.flush();
        bw.close();

    }
}