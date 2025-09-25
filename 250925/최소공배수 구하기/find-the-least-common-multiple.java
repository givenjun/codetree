import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        System.out.println(min_mul(n, m));
    }
    public static int min_mul(int n, int m) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int cnt = 1;
        boolean same = false;
        int mul = 0;
        for (int i = 1; i <= m; i++) {
            int val = n * i;
            sb1.append(val + " ");
        }
        return mul;
    }
}