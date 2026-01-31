import java.util.Scanner;

public class Main {
    public static int[] arr;
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        System.out.println(minMul(1));
    }
    public static int minMul(int num) {
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (num % arr[i] == 0) cnt++;
            else break;
        } 

        if (cnt == n) return num;
        return minMul(num + 1);
    }
}