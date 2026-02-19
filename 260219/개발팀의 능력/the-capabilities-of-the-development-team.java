import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] list = br.readLine().split(" ");
        int n = list.length;
        
        int[] arr = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(list[i]);
            total += arr[i];
        }

        int sco1 = 0, sco2 = 0, sco3 = 0;
        int minVal, maxVal, minDif = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int x = 0; x < n; x++) {
                    for (int y = x + 1; y < n; y++) {
                        if (x == i || x == j || y == i || y == j) continue;
                        sco1 = arr[i] + arr[j];
                        sco2 = arr[x] + arr[y];
                        sco3 = total - sco1 - sco2;

                        if (sco1 == sco2 || sco2 == sco3 || sco3 == sco1) continue;
                        minVal = Math.min(sco1, Math.min(sco2, sco3));
                        maxVal = Math.max(sco1, Math.max(sco2, sco3));
                        minDif = Math.min(minDif, maxVal - minVal);
                    }
                }
            }
        }
        System.out.print(minDif);
    }
}