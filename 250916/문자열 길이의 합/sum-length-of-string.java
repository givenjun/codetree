import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        // String[] str = new String[N];
        int len = 0;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            len += str.length();
            if (str.charAt(0) == 'a') cnt++;
        }
        
        bw.write(len + " " + cnt);
        bw.flush();
        bw.close();

    }
}