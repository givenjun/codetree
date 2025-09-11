import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);

        int[][] arr = new int[N][M];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                String[] ele = br.readLine().split(" ");
                for (int k = 0; k < M; k++) {
                    int n = Integer.parseInt(ele[k]);
                    if (i == 1) {
                        if (arr[j][k] == n) bw.write("0 ");
                        else bw. write("1 ");
                        // bw.write(arr[j][k] + "<->" + n + " ");
                        continue;
                    }
                    arr[j][k] = n;
                }
                if (i == 1) bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}