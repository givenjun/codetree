import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int n1 = Integer.parseInt(str[2]);
        int n2 = Integer.parseInt(str[4]);
        int n3 = Integer.parseInt(str[9]);
        
        bw.write((n1 + n2 + n3) + "");
        bw.flush();
        bw.close();
    }
}