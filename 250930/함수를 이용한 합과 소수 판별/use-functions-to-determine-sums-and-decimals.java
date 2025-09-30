import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            cnt += sum_even(i);
        }
        System.out.println(cnt);
    }
    public static int prime(int n) {
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            if (cnt != 0) return 0;
            if (n % i == 0) cnt++;
        }
        return n;
    }
    public static int sum_even(int n) {
        if (prime(n) != 0) {
            int a = n / 100;
            int b = n / 10;
            int c = n % 10;
            int sum = a + b + c;
            if (sum % 2 == 0) return 1;
        }
        return 0;
    }
}