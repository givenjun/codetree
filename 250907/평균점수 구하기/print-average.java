import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] score = br.readLine().split(" ");
        double sum = 0, avg = 0;

        for (int i = 0; i < score.length; i++) {
            sum += Double.parseDouble(score[i]);
        }
        avg = sum / score.length;
        String s = String.format("%.1f", avg);

        bw.write(s);
        bw.flush();
        bw.close();
    }
}