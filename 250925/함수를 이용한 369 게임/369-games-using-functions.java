import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        int cnt = 0;

        for (int i = A; i <= B; i++) {
            if (mul_3(i) || contain_369(i) || (mul_3(i) && contain_369(i))) cnt++;
        }
        System.out.println(cnt);

    }
    public static boolean mul_3(int n) {
        if (n % 3 == 0) return true;
        else return false;
    }

    public static boolean contain_369(int n) {
        String num = Integer.toString(n);
        if (num.contains("3") || num.contains("6") || num.contains("9")) return true;
        else return false;
    }
}