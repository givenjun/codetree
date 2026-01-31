import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(powSum(n));
    }
    public static int powSum(int n) {
        if (n == 0) return 0;

        int quot = n / 10;
        int remain = n % 10;
        
        return powSum(quot) + remain * remain;
    }
}