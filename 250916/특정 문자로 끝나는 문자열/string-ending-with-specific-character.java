import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = new String[11];
        for (int i = 0; i < 11 ; i++){
            str[i] = br.readLine();
        }
        
        br.readLine();
        int cnt = 0;
        char c = str[10].charAt(0);

        for (int i = 0; i < 10; i++) {
            if (str[i].charAt(str[i].length() - 1) == c) {
                cnt++;
                bw.write(str[i] + "\n");
            }
        }
        if (cnt == 0) bw.write("None");
        bw.flush();
        bw.close();
    }
}