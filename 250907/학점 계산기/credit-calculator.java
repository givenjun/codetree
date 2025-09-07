import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        double sum = 0, avg = 0;
        String grade = "";

        String[] str = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            double sco = Double.parseDouble(str[i]);
            sum += sco;
        }
        avg = sum / N;
        String s = String.format("%.1f", avg);

        grade = (avg >= 4.0) ? "Perfect" : (avg >= 3.0) ? "Good" : "Poor"; 

        bw.write(s + "\n" + grade);
        bw.flush();
        bw.close();

    }
}