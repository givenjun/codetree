import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[9];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(str[i]);
            for (int j = 1; j < 10; j++) {
                if (num == j) arr[j - 1]++;
            }
        }
        for (int a : arr) {
            bw.write(a + "\n");
        }
        bw.flush();
        bw.close();
    }
}