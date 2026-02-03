import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        binary(n);
    }
    public static void binary(int n) {
        if (n == 0) return;

        int quot = n / 2;
        int remain = n % 2;

        binary(quot);
        if (remain == 1) {
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }
    }
}