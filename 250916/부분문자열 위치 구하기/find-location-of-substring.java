import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();
        int idx = -1;

        for (int i = 0; i < str1.length() - 1; i++) {
            if (str1.substring(i, i + 2).equals(str2)) {
                idx = i;
                break;
            }
        }
        bw.write(idx + "");
        bw.flush();
        bw.close();
    }
}