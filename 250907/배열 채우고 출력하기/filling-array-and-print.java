import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        for (int i = str.length - 1; i >= 0; i--) {
            bw.write(str[i]+"");
        }
        bw.flush();
        bw.close();
    }
}