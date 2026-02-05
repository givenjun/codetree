import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] NKPT = br.readLine().split(" ");
        int N = Integer.parseInt(NKPT[0]);
        int K = Integer.parseInt(NKPT[1]);
        int P = Integer.parseInt(NKPT[2]);
        int T = Integer.parseInt(NKPT[3]);
        int[][] time = new int[251][2];
        int[][] person = new int[N + 1][2];

        int timeMax = 0;
        int timeMin = 251;
        for (int i = 0; i < T; i++) {
            String[] txy = br.readLine().split(" ");
            int t = Integer.parseInt(txy[0]);
            int x = Integer.parseInt(txy[1]);
            int y = Integer.parseInt(txy[2]);
            time[t][0] = x;
            time[t][1] = y;
            
            timeMax = (t > timeMax) ? t : timeMax;
            timeMin = (t < timeMin) ? t : timeMin;
        }
        person[P][0] = 1;

        for (int i = timeMin; i <= timeMax; i++) {
            // System.out.print(i + " : " + time[i][0] + " -> " + time[i][1] + " | ");

            int[] personA = person[time[i][0]];
            int[] personB = person[time[i][1]];

            if (personA[0] == 1 || personB[0] == 1) {
                if (personA[0] == 1) personA[1]++;
                if (personB[0] == 1) personB[1]++;
            }

            if ((personA[0] == 1 && personA[1] <= K) || (personA[0] == 1 && personA[1] <= K)) {
                personA[0] = 1;
                personB[0] = 1;
            }

            // for (int j = 1; j < N + 1; j++) {
            //     System.out.print(" 감염 " + person[j][0] + ", 악수" + person[j][1] + "  ");
            // }
            // System.out.println();
        }
        for (int j = 1; j < N + 1; j++) {
            System.out.print(person[j][0]);
        }
    }
}