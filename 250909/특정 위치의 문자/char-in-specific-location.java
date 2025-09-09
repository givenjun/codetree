import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] c = {'L', 'E', 'B', 'R', 'O', 'S'};
        String str = br.readLine();
        int index = -1;
        
        for (int i = 0; i < 6; i++) {
            if (str.charAt(0) == c[i]) {
                bw.write(i + "");
                index = i;
            }
        }
        if (index == -1) bw.write("None");
        bw.flush();
        bw.close();
    }
}