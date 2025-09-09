import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int[] arr = new int[B];
        int total = 0;

        while (true) {
            int S = A / B;
            int R = A % B;
            arr[R]++;
            A = S;

            if (S == 0) break;
        }
        for (int i = 0; i < B; i++) {
            total += arr[i] * arr[i];
        }
        bw.write(total + "");
        bw.flush();
        bw.close();
    }
}