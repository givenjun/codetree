import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] SQ = br.readLine().split(" ");
        String S = SQ[0];
        int Q = Integer.parseInt(SQ[1]);
        int len = S.length();

        for (int i = 0; i < Q; i++) {
            String com = br.readLine();

            if (com.equals("1")) {
                S = S.substring(1, len) + S.substring(0, 1);
            }
            else if (com.equals("2")) {
                S = S.substring(len - 1, len) + S.substring(0, len - 1);
            }
            else if (com.equals("3")) {
                String rev = "";
                for (int j = len - 1; j >= 0; j--) {
                    rev += S.charAt(j);
                }
                S = rev;
            }
            bw.write(S + "\n");
        }
        bw.flush();
        bw.close();
    }
}