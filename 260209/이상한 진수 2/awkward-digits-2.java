import java.io.*;

public class Main {
    public static String binary = "";
    public static String toBinary(int n) {
        if (n == 0) return binary;

        return toBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        int max = Integer.MIN_VALUE;
        int num = 0;
        for (int i = 0; i < 1024; i++) {
            String str = toBinary(i);
            int len = (str.length());

            for (int j = 0; j < len; j++) {
                char c = (str.charAt(j) == '1') ? '0' : '1';
                char[] apart = str.toCharArray();
                apart[j] = c;
                String sub = new String(apart);
                if (sub.equals(a)) {
                    // System.out.println(str + " " + a + " <-> " + sub);
                    // System.out.println(i);
                    num = i;
                    if (num > max) max = num;
                }
            }
        }

        System.out.print(max);
    }
}