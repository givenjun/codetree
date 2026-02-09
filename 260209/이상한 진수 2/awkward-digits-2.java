import java.io.*;

public class Main {
    public static int toDecimal(char[] a) {
        int len = a.length;
        int num = 0;
        int mul = 1;
        for (int i = len - 1; i >= 0; i--) {
            num += (a[i] - '0') * mul;
            mul *= 2;
        }
        return num;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        char[] apart = a.toCharArray();
        int len = a.length();
        int max = Integer.MIN_VALUE;

        for (int j = 0; j < len; j++) {
            apart[j] = (apart[j] == '1') ? '0' : '1';
            int num = toDecimal(apart);    
            if (num > max) max = num;
            apart[j] = (apart[j] == '1') ? '0' : '1';
        }

        System.out.print(max);
    }
}