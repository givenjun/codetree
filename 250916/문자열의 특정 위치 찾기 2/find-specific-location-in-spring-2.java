import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String cs = br.readLine();
        char c = cs.charAt(0);
        int cnt = 0;

        String[] str = new String[5];
        str[0] = "apple";
        str[1] = "banana";
        str[2] = "grape";
        str[3] = "blueberry";
        str[4] = "orange";

        for (int i = 0; i < 5; i++) {
            if (str[i].charAt(2) == c || str[i].charAt(3) == c) {
                bw.write(str[i] + "\n");
                cnt++;
            }
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}