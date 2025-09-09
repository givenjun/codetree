import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int cnt = 0, index = -1;

        for (int i = 0; i < N; i++) {
            if (str[i].equals("2")) cnt++;
            if (cnt == 3) { index = i + 1; break; }
        }
        bw.write(index + "");
        bw.flush();
        bw.close();
    }
}