import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int sum = 0;
        int cnt = 0;
        double avg = 0;

        for (int i = 0; i < str.length; i++) {
            int n = Integer.parseInt(str[i]);
            if (n >= 250) {
                cnt = i;
                break;
            }
            sum += n;
        }

        avg = sum * 1.0 / cnt;

        bw.write(sum + " " + avg);
        bw.flush();
        bw.close();

    }
}