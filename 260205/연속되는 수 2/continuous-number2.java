import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int a = 0, b = 0, cnt = 1, max = 1;
        for (int i = 1; i < n; i++) {
            if (cnt > max) max = cnt;
            a = arr[i - 1];
            b = arr[i];
            if (a == b) cnt++;
            else cnt = 1;
        }

        System.out.print(max);
    }
}