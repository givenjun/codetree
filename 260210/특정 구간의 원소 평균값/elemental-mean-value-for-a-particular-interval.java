import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] str = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int sum = 0;
                for (int k = j; k <= j + i; k++) {
                    // System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                double avg = sum / (double)(i + 1);
                // System.out.println((j + 1) + " ~ " + (j + i + 1) + " -> " + avg);
                for (int k = j; k <= j + i; k++) {
                    if (avg == (double)arr[k]) {
                        cnt++;
                        break;
                    }
                }
            }
        }
    System.out.println(cnt);
    }
}