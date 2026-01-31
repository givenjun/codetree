import java.util.Scanner;
public class Main {
    public static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        sum(n);
        System.out.println(cnt);
    }
    public static int sum(int n) {
        if (n == 1) return 0;

        if (n % 2 == 0) {
            n /= 2;
            cnt++;
        }
        else {
            n /= 3; 
            cnt++;
        }
        return sum(n);
    }
}