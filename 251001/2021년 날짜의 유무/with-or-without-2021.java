import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        check(m, d);
    }
    public static void check (int m, int d) {
        String month = m + "";
        if ("2".equals(month)) {
            if ((d >= 1 && d <= 28)) System.out.println("Yes");
            else System.out.println("No");
        }
        else if ("1 3 5 7 8 10 12".contains(month)) {
            if ((d >= 1 && d <= 31)) System.out.println("Yes");
            else System.out.println("No");
        }
        else if ("4 6 9 11".contains(month)) {
            if ((d >= 1 && d <= 30)) System.out.println("Yes");
            else System.out.println("No");
        }
        else System.out.println("No");
    }
}