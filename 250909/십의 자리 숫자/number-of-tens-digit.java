import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int[] arr = new int[9];

        for (String s : str) {
            int n = Integer.parseInt(s);

            if (n == 0) break;
            if (n / 10 == 0) continue;
            arr[n / 10 - 1]++;

        }
        int i = 0;
        for (int a : arr) {
            bw.write((i + 1) + " - " + arr[i] + "\n");
            i++;
        }
        bw.flush();
        bw.close();
    }
}