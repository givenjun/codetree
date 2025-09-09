import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int[] init = {n, n};

        for (int i = 1; i < str.length; i++) {
            int num = Integer.parseInt(str[i]);
            if (num == 999 || num == -999) break;
            
            init[0] = (init[0] > num) ? init[0] : num;
            init[1] = (init[1] < num) ? init[1] : num; 
        }

        bw.write(init[0] + " " + init[1]);
        bw.flush();
        bw.close();

    }
}