import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(seq(n));
    }
    public static int seq(int n) {
        if (n == 1) return 2;
        if (n == 2) return 4;

        return (seq(n - 1) * seq(n - 2)) % 100;
    }
}