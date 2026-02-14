import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] arr = new char[101];

        for (int i = 0; i < n; i++) {
            String[] pi = br.readLine().split(" ");
            int pos = Integer.parseInt(pi[0]);
            char info = pi[1].charAt(0);

            arr[pos] = info;
        }

        int max = 0;
        for (int i = 0; i < 101; i++) {
            for (int j = i + 1; j < 101; j++) {
                if ((arr[i] != 'G' && arr[i] != 'H') || (arr[j] != 'G' && arr[j] != 'H')) continue;

                int cntG = 0;
                int cntH = 0;

                for (int k = i; k <= j; k++) {
                    
                    if (arr[k] == 'G') {
                        cntG++;
                    }
                    if (arr[k] == 'H') {
                        cntH++;
                    }
                }
                if (cntG == 0 || cntH == 0 || cntG == cntH) {
                    int len = j - i;
                    max = Math.max(max, len);
                }
            }
        }

        System.out.println(max);
    }
}