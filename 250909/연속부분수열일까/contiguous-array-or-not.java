import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] N = br.readLine().split(" ");
        int N1 = Integer.parseInt(N[0]);
        int N2 = Integer.parseInt(N[1]);

        String str1 = br.readLine().replace(" ", "");
        String str2 = br.readLine().replace(" ", "");
        String ans = "No";

        for (int i = 0; i <= N1 - N2; i++) {
            String str = str1.substring(i, i + N2);
            if (str.equals(str2)) { ans = "Yes"; break; }
        }
        bw.write(ans);
        bw.flush();
        bw.close();
    }
}