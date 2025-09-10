import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[(N) * (N)];
        int index = 0;

        for (int i = 0; i < N; i++) {
            int n1 = Integer.parseInt(str[i]);
            for (int j = 0; j < N; j++) {
                if (j == i) continue;
                int n2 = Integer.parseInt(str[j]);
                int dif = n2 - n1;
                if (dif < 0) dif *= -1;

                arr[index] = dif;
                // bw.write(arr[index] + " ");
                index++;
            }
        }
        int min = 100;
        for (int i = 0; i < index; i++) {
            min = (min < arr[i]) ? min : arr[i];
        }
        bw.write(min + "");
        bw.flush();
        bw.close();
    }
}