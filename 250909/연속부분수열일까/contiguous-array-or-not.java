import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] N = br.readLine().split(" ");
        int N1 = Integer.parseInt(N[0]);
        int N2 = Integer.parseInt(N[1]);

        String[] str1 = br.readLine().split(" ");
        String[] str2 = br.readLine().split(" ");
        String ans = "No";

        for (int i = 0; i <= N1 - N2; i++) {
            int cnt = 0;
            for (int j = 0; j < N2; j++) {
                if (str1[j + i].equals(str2[j])) cnt++;
            }
            if (cnt == N2) { ans = "Yes"; break; }
        }
        bw.write(ans);
        bw.flush();
        bw.close();
    }
}