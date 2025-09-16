import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String res = "";
        int cnt = 1;
        int i = 1;

        for (i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) != str.charAt(i)) {
                res += str.charAt(i - 1);
                res += (cnt + "");
                cnt = 1;
            }
            else cnt++;
        }
        res += str.charAt(i - 1);
        res += (cnt + "");
        bw.write(res.length()+"\n");
        bw.write(res);
        bw.flush();
        bw.close();
    }
}