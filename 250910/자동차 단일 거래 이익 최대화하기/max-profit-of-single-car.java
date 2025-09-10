import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int size = ((N - 1) * N) / 2;
        int[] arr = new int[size];
        int cnt = 0;

        for (int i = N - 1; i >= 0; i--) {
            int n2 = Integer.parseInt(str[i]);
            for (int j = i; j >= 0; j--) {
                int n1 = Integer.parseInt(str[j]);
                if (n2 - n1 > 0) {
                    arr[cnt] = n2 - n1;
                    cnt++;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < size; i++) {
            max = (max > arr[i]) ? max : arr[i];
        }
        bw.write(max + "");
        bw.flush();
        bw.close();
    }
}