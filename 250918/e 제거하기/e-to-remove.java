import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int idx = -1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                idx = i;
                break;
            }
        }

        str = str.substring(0, idx) + str.substring(idx + 1);

        bw.write(str);
        bw.flush();
        bw.close();

    }
}