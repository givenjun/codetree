import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String str = br.readLine();

        while (true) {
            int N = Integer.parseInt(br.readLine());

            if (N >= str.length()) str = str.substring(0, str.length() - 1);
            else str = str.substring(0, N) + str.substring(N + 1);

            bw.write(str + "\n");
            if (str.length() == 1) break;
        }
        bw.flush();
        bw.close();
    }
}