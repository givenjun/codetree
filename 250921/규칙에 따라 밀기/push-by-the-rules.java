import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] com = br.readLine().split("");
        int str_len = str.length();
        int com_len = com.length;

        for (int i = 0; i < com_len; i++) {
            if (com[i].equals("R")) {
                str = str.substring(str_len - 1, str_len) + str.substring(0, str_len - 1);
            }
            else if (com[i].equals("L")) {
                str = str.substring(1, str_len) + str.substring(0 , 1);
            }
        }
        bw.write(str);
        bw.flush();
        bw.close();
    }
}