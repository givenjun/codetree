import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] binary = sc.next().split("");
        int n = binary.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(binary[i]);
        }
        int val = 0;
        int num = 1;

        for (int i = n - 1; i >= 0; i--) {
            val += num * arr[i];
            num *= 2; 
        }

        System.out.println(val);
    }
}