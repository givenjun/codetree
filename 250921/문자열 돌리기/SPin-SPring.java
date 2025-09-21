import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int len = str.length();
        String[] res = new String[len + 1];
        res[0] = str;
        bw.write(str + "\n");

        for (int i = 1; i < len + 1; i++) {
            String s = "";
            s += res[i - 1].charAt(len - 1);
            for (int j = 0; j < len - 1; j++) {
                s += res[i - 1] .charAt(j);
            }
            res[i] = s;
        }
        for (int i = 1; i < len + 1; i++) {
            bw.write(res[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}