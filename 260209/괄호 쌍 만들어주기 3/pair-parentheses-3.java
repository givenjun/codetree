import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a = br.readLine().split("");
        int n = a.length;

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String open = a[i];
            if (open.equals("(")) {
                for (int j = i + 1; j < n; j++) {
                    String close = a[j];
                    if (close.equals(")")) cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}