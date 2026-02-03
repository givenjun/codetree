import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        if (n == 0) System.out.println(0);
        else notation(n, b);
    }
    public static void notation (int n, int b) {
        if (n == 0) return;

        int quot = n / b;
        int remain = n % b;

        notation(quot, b);

        System.out.print(remain);
    }
}