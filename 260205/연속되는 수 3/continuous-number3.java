import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] chk = new int[n / 2 + 1];
        int pos = 0, cnt = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            chk[pos] = cnt;
            if (i >= 1) {
                if ((arr[i - 1] * arr[i]) < 0) {
                    cnt = 1;
                    pos++;
                }
                else if (arr[i - 1] > 0 && arr[i] > 0) {
                    cnt++;
                    chk[pos] = cnt;
                }
                else if (arr[i - 1] < 0 && arr[i] < 0) {
                    cnt++;
                    chk[pos] = cnt;
                }
            }
        }
        int max = 0;
        for (int c : chk) {
            if (c > max) max = c;
        }
        System.out.print(max);
    }
}