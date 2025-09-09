import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            if (i >= 2) {
                int sum = arr[i - 1] + arr[i - 2];
                arr[i] = sum % 10;
            }
            else arr[i] = Integer.parseInt(str[i]);

            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}