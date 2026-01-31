import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int sum = a * b * c;
        System.out.println(digitSum(sum));
    }
    public static int digitSum(int sum) {
        if (sum == 0) return 0;

        int quot = sum / 10;
        int remain = sum % 10;

        return digitSum(quot) + remain;
    }
}