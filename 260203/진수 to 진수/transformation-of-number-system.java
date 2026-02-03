import java.util.Scanner;
public class Main {
    static String res = "";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();

        toBNotation(toDecimal(N, A), B);

        if (N.equals("0")) System.out.println("0");
        else System.out.println(res);
    }

    public static int toDecimal (String N, int A) {
        String[] n = N.split("");
        int len = n.length;
        int num = 1;
        int sum = 0;

        for (int i = len - 1; i >= 0; i--) {
            sum += num * Integer.parseInt(n[i]);
            num *= A;
        }

        return sum;
    }

    public static String toBNotation (int N, int B) {
        if (N == 0) return res;

        toBNotation((N / B), B);

        return res += (N % B);
    }
}