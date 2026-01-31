import java.util.Scanner;
public class Main {
    public static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        seq(n);
        System.out.println(cnt);
    }
    public static int seq(int n) {
        if (n == 1) return 1;
        else {
            if (n % 2 == 0) {
                cnt++;
                n /= 2;
            }
            else {
                cnt++;
                n = n * 3 + 1;
            }
        }
        return seq(n);
    }
}