import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] firstNum = new int[10];
        int[] firstNum = new int[10];

        String[] str = new String[4];
        for (int i = 0; i < n; i++) {
            str[i] = br.readLine();
            String[] b = str[i].split(" ");
            int first = b[0].charAt(0);
            int second = b[0].charAt(1);
            int third = b[0].charAt(2);

            int strike = Integer.parseInt(b[1]);
            int ball = Integer.parseInt(b[2]);

        }


    }
}