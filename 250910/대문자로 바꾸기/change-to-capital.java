import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 5; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                char c = str[j].charAt(0);
                c += 'A' - 'a';
                bw.write(c + " ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}