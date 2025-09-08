import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 0;
        String[] str = br.readLine().split(" ");
        
        for (int i = 0; i < str.length; i++) {
            int num = Integer.parseInt(str[i]);
            if (num % 3 == 0) break;
            n = num;
        }

        bw.write(n+"");
        bw.flush();
        bw.close();

    }
}