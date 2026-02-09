import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int [] intArr = new int[n];

        for (int i = 0; i < n ; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        int cnt = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (intArr[i] <= intArr[j] && intArr[j] <= intArr[k])
                        cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}