import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int[] sum = new int[2];
        int cnt = 0;
        double avg = 0;

        for (int i = 0; i < str.length; i++) {
            if ((i + 1) % 2 == 0) sum[0] += Integer.parseInt(str[i]);
            else if ((i + 1) % 3 == 0) { 
                sum[1] += Integer.parseInt(str[i]);
                cnt++;
            }
        }

        avg = sum[1] * 1.0 / cnt;
        String num = String.format("%.1f", avg);

        bw.write(sum[0] + " " + num);
        bw.flush();
        bw.close();

    }
}