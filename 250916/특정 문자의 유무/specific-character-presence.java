import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String res = "";
        res += (str.contains("ee")) ? "Yes " : "No ";
        res += (str.contains("ab")) ? "Yes" : "No";

        bw.write(res);
        bw.flush();
        bw.close(); 

    }
}