import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        boolean seq = false;
        for (int i = 0; i < n1 - n2; i++) {
            for (int j = 0; j < n2; j++) {
                if (check(a[i+j], b[j])) {
                    // System.out.println(a[i+j] + " " + b[j]);
                    cnt++;
                }
                else { 
                    cnt = 0; break; 
                }
                if (cnt == (n2)) { seq = true; break; }
            }
            // System.out.println();
        }
        if (seq) System.out.println("Yes");
        else System.out.println("No");
    }
    public static boolean check(int a, int b) {
        if (a == b) return true;
        else return false;
    }
}