import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] a = new int[n];
        int[] b = new int[m];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int i = 0; i <= n - m; i++) {
            int[] chk = new int[n];
            boolean exist = true;
            for (int j = 0; j < m; j++) {
                chk[b[j] - 1]++;
            }

            for (int j = i; j < i + m; j++) {
                chk[a[j] - 1]--;
            }

            for (int j = 0; j < n; j++) {
                if (chk[j] != 0) {
                    exist = false; 
                    break;
                }
            }
            
            if (exist) cnt++;
        }
        System.out.print(cnt);
    }
}