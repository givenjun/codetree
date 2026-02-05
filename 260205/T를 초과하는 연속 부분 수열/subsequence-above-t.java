import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        boolean cond = false;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > t) cond = true;
        }
        // Please write your code here.

        int cnt = 1, max = 1; 
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > t && arr[i] > t) {
                cnt++;
            }
            else {
                cnt = 1;
            }
            max = (cnt > max) ? cnt : max;
        } 
        if (cond)
            System.out.print(max);
        else 
            System.out.print(0);
    }
}