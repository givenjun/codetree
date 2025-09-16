import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String[] str = br.readLine().split(" ");
        String str1 = str[0];
        String str2 = str[1];
        int sl1 = str1.length();
        int sl2 = str2.length();

        if (sl1 > sl2) bw.write(str1 + " " + sl1);
        else if (sl1 < sl2) bw.write(str2 + " " + sl2);
        else bw.write("same");

        bw.flush();
        bw.close();
    }
}