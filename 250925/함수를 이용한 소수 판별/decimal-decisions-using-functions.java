import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += prime(i);
        }
        System.out.println(sum);
    }   
    public static int prime(int n) {
        int cnt = 2;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) cnt++;
            if (cnt >= 3) return 0;
        }
        return n;
    }
}