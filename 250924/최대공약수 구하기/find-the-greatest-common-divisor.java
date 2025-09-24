import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        System.out.println(max_div(n, m));
    }
    public static int max_div(int n, int m) {
        int div = 0;
        for (int i = m; i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                div = i;
                break;
            } 
        }
        return div;
    }
}