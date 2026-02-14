import java.io.*;

public class Main {
    public static int[] list;

    public static int getDif(int i, int j, int k) {
        int sum1 = list[i] + list[j] + list[k];
        int sum2 =0;
        for (int n = 0; n < 6; n++) {
            sum2 += list[n];
        }
        sum2 -= sum1;
        return Math.abs(sum1 - sum2);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        list = new int[6];
        String[] strList = br.readLine().split(" ");
        for (int i = 0; i < 6; i++) {
            list[i] = Integer.parseInt(strList[i]);
        }


        int minDif = Integer.MAX_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) { 
                for (int k = j + 1; k < 6; k++) {
                    minDif = Math.min(minDif, getDif(i, j, k));
                }
            }
        }
        System.out.print(minDif);
    }
}