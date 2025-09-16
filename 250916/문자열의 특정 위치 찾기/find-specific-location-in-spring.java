import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int idx = str[0].indexOf(str[1]);

        if (idx >= 0) bw.write(idx + "");
        else bw.write("No"); 

        bw.flush();
        bw.close();

    }
}