import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String whole = br.readLine();
        String part = br.readLine();
        int w_len = whole.length();
        int p_len = part.length();
        int cnt = 0;

        for (int i = 0; i < w_len - p_len + 1; i++) {
            // bw.write(i+"\n");
            String start = whole.substring(0, i);
            String comp = whole.substring(i, i + p_len);
            String end = whole.substring(i + p_len);

            // bw.write(comp + " " + part + "\n");
            if (comp.equals(part)) {
                whole = start + end;
                i = -1;
                w_len = whole.length();
                cnt++;
            }
        }
        // bw.write(cnt+" ");
        bw.write(whole);
        bw.flush();
        bw.close();
    }
}