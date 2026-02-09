import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min = Integer.MAX_VALUE;
        int n = Integer.parseInt(br.readLine());
        String[] strArrA = br.readLine().split(" ");
        int[] intArrA = new int[n];
        

        for (int i = 0; i < n; i++) {
            intArrA[i] = Integer.parseInt(strArrA[i]);
        } 
        
        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                sum += Math.abs(i - j) * intArrA[j];
            }
            if (sum < min) min = sum;
        }
        System.out.println(min);
    }
}