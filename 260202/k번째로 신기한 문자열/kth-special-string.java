import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        String t = s[2];
        int tLen = t.length();

        String[] sList = new String[n];

        for (int i = 0; i < n; i++) {
            sList[i] = br.readLine();
        }
        Arrays.sort(sList);
        int cnt = 0;
        int idx = 0;

        for (int i = 0; i < n; i++) {
            if (sList[i].length() < tLen) continue;
            if ((sList[i].substring(0, tLen)).equals(t)) {
                cnt++;
                if (cnt == k) {
                    idx = i;
                    break;
                }
            }
        }

        System.out.println(sList[idx]);
    }
}