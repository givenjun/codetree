import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        int sum = 0;
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        sum += arr[m];
        while (m != 1) {
            if (even(m)) m /= 2;
            else m -= 1;
            sum += arr[m];
        }

        System.out.println(sum);
    }

    public static boolean even (int n) {
        if (n % 2 == 0) return true;
        else return false;
    }
}