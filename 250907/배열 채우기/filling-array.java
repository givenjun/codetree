import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int cnt = s.length;

        for (int i = 0; i < cnt; i++) {  
            if (s[i].equals("0")) {
                cnt = i;
                break;
            }
        }

        for (int i = cnt - 1; i >= 0; i--) {
            bw.write(s[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}