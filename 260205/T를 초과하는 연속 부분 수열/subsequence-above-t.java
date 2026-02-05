import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        int[] chk = new int[n / 2 + 1];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int max = 0, pos = 0; 

        chk[pos] = (arr[0] > t) ? 1 : 0;
        for (int i = 1; i < n; i++) {
            if ((arr[i - 1] >= arr[i]) || arr[i] <= t) {
                pos++;
            }
            else {
                chk[pos]++;
            }
            max = (chk[pos] > max) ? chk[pos] : max;
        }
        System.out.print(max);
    }
}