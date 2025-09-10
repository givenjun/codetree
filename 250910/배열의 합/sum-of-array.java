import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] sum = new int[4];
        
        for (int i = 0; i < 4; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < 4; j++) {
                int n = Integer.parseInt(str[j]);
                sum[i] += n;
            }
            bw.write(sum[i] + "\n");  
        }
        bw.flush();
        bw.close();
    }
}