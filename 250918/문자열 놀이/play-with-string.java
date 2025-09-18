import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] SQ = br.readLine().split(" ");
        String S = SQ[0];
        int Q = Integer.parseInt(SQ[1]);
        String res = "";
        int cnt = 0; 

        for (int i = 0; i < Q; i++) {
            String[] C = br.readLine().split(" ");
            if (C[0].equals("1")) {
                String tmp = "";
                String str = "";

                if (res.length() == 0) str = S;
                else str = res;

                int a = Integer.parseInt(C[1]);
                int b = Integer.parseInt(C[2]);

                char c1 = str.charAt(a - 1);
                char c2 = str.charAt(b - 1);

                for (int j = 0; j < str.length(); j++) {
                    char c = str.charAt(j);
                    if (j == (a - 1)) tmp += c2;
                    else if (j == (b - 1)) tmp += c1;
                    else tmp += c;
                }
                res = tmp;
                bw.write(res + "\n");
            }
            else if (C[0].equals("2")) {
                if (res.length() == 0) res = S.replace(C[1], C[2]);
                else res = res.replace(C[1], C[2]);
                bw.write(res + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}