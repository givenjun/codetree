import java.util.Scanner;
public class Main {
    public static int max;
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        max = 0;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        max(n - 1);

        System.out.println(max);
    }

    public static int max(int n) {
        if (n == -1) return 0;

        if (max <= arr[n]) {
            max = arr[n];   
        }
        return max(n - 1);
    } 
}