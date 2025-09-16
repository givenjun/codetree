import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String str = "";

        for (int i = 0; i < N; i++) {
            str += br.readLine();
        }
        bw.write(str);
        bw.flush();
        bw.close();

    }
}