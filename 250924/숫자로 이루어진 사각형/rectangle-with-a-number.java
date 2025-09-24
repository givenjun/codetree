import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        rect(n);
        
    }
    public static void rect(int N) {
        int val = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++){
                if (val == 10) val = 1;
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }
    }
}