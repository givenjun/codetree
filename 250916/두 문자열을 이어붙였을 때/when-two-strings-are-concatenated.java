import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s1 = br.readLine();
        String s2 = br.readLine();
        String str1 = s1 + s2;
        String str2 = s2 + s1;

        if (str1.equals(str2)) bw.write("true");
        else bw.write("false");
        bw.flush();
        bw.close();
    }
}