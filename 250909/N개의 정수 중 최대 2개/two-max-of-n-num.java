import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine().replace(" ", ""));

        String[] str = br.readLine().split(" ");
        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(list);

        bw.write(list[N - 1] + " " + list[N - 2]);
        bw.flush();
        bw.close();

    }
}