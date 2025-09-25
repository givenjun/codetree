import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        System.out.println(min_mul(n, m));
    }
    public static int min_mul(int n, int m) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int cnt = 1;
        boolean same = false;
        int mul = 0;
        for (int i = 1; i <= m; i++) {
            int val = n * i;
            sb1.append(val + " ");
        }
        for (int i = 1; i <= n; i++) {
            int val = m * i;
            sb2.append(val + " ");
        }
        String[] n_mul = sb1.toString().split(" ");
        String[] m_mul = sb2.toString().split(" ");
        for (int i = 0; i < n_mul.length; i++) {
            for (int j = 0; j < m_mul.length; j++) {
                if (n_mul[i].equals(m_mul[j])) {
                    if (Integer.parseInt(n_mul[i]) < Integer.parseInt(m_mul[j])) break;
                    mul = Integer.parseInt(n_mul[i]);
                    break;
                }
                if (mul != 0) break;
            }
        }
        return mul;
    }
}