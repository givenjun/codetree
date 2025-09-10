import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int min = 1000;
        String[] str = br.readLine().split(" ");

        for (int i = 0; i < str.length; i++) {
            int n = Integer.parseInt(str[i]);

            if (n < 500) max = (max > n) ? max : n;
            if (n > 500) min = (min < n) ? min : n;  
        }

        bw.write(max + " " + min);
        bw.flush();
        bw.close();
 
    }
}