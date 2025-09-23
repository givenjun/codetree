import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        String A = str[0];
        int res_A = filter(A);
        String B = str[1];
        int res_B = filter(B);
        
        
        bw.write((res_A + res_B) + "");
        bw.flush();
        bw.close();

    }

    public static int filter(String S) {
        String res = "";
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            
            if (c >= '0' && c <= '9') res += c; 
            else {
                if (res.length() != 0) break;
            }
        }
        return Integer.parseInt(res);
    }
}