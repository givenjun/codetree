import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        int[] chk = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int cnt = 1, max = 0, pos = 0; 
        int condition = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > t) condition++;

            if (condition > 0) {
                if (arr[i] < arr[i + 1]) {
                    cnt++;
                }
                else {
                    cnt = 1;
                }
            }
            max = (cnt > max) ? cnt : max;
        }
        if (condition > 0)
            System.out.print(max);
        else 
            System.out.print(0);
    }
}