import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();

        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = s3.length();

        int dif1 = ((l1 - l2) > 0) ? l1 - l2 : (l1 - l2) * -1;
        int dif2 = ((l2 - l3) > 0) ? l2 - l3 : (l2 - l3) * -1;
        int dif3 = ((l1 - l3) > 0) ? l1 - l3 : (l1 - l3) * -1;   

        int res = (dif1 > dif2) ? dif1 : dif2;
        res = (res > dif3) ? res : dif3;

        bw.write(res + "");
        bw.flush();
        bw.close();

    }
}