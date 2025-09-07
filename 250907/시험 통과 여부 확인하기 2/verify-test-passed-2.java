import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] pass = new String[N];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String[] score = br.readLine().split(" ");
            int sum = 0;
            double avg = 0;
            for (int j = 0; j < 4; j++) {
                sum += Integer.parseInt(score[j]);
            }
            avg = sum * 1.0 / 4;
            
            if (avg >= 60) { pass[i] = "pass"; cnt++;}
            else pass[i] = "fail";
        }
        for (int i = 0; i < N; i++) {
            bw.write(pass[i] + "\n");
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();

    }
}