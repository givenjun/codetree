import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int even = 0, sum = 0;
        
        for (int i = 0; i < str.length; i++) {
            int n = Integer.parseInt(str[i]);
            if (n == 0) break;
            if (n % 2 == 0) { even++; sum += n; }
        }

        bw.write(even + " " + sum);
        bw.flush();
        bw.close();

    }
}