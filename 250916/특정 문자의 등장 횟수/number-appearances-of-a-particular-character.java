import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String ee = "ee";
        String eb = "eb";
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals(ee)) cnt1++;
            if (str.substring(i, i + 2).equals(eb)) cnt2++; 
        }
        bw.write(cnt1 + " " + cnt2);
        bw.flush();
        bw.close();
    }
}