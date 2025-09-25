import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(check(n));
    }
    public static String check(int n) {
        boolean even = false;
        boolean sum_5 = false;
        int sum = n / 10 + n % 10;

        if (n % 2 == 0) even = true;
        if (sum % 5 == 0) sum_5 = true;
        if (even && sum_5) return "Yes";
        else return "No";
    }
}