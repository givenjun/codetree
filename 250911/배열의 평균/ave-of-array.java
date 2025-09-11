import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[2][4]; 
        

        for (int i = 0; i < 2; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < 4; j++) {
                int n = Integer.parseInt(str[j]);
                arr[i][j] = n;
            }
        }

        int[] hor_sum = new int[2];
        int[] ver_sum = new int[4];
        int sum = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                hor_sum[i] += arr[i][j];
                ver_sum[j] += arr[i][j];
            }
        }
        sum = hor_sum[0] + hor_sum[1];

        double[] hor_avg = new double[2];
        for (int i = 0; i < 2; i++) {
            hor_avg[i] = hor_sum[i] / 4.0;
        }
        double[] ver_avg = new double[4];
        for (int i = 0; i < 4; i++) {
            ver_avg[i] = ver_sum[i] / 2.0;
        }
        double avg = sum / 8.0;

        String[] hor = new String[2];
        for (int i = 0; i < 2; i++) {
            hor[i] = String.format("%.1f", hor_avg[i]);
            bw.write(hor[i] + " ");
        }
        bw.newLine();
        String[] ver = new String[4];
        for (int i = 0; i < 4; i++) {
            ver[i] = String.format("%.1f", ver_avg[i]);
            bw.write(ver[i] + " ");
        }
        bw.newLine();
        String total = String.format("%.1f", avg);
        bw.write(total + "");
        bw.flush();
        bw.close();
    }
}