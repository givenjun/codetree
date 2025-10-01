import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        // System.out.println(leaf(y));
        // System.out.println(day(m, d, y));
        season(day(m, d, y));
    }
    public static void season (int n) {
        if (n >= 3 && n <= 5) System.out.println("Spring");
        else if (n >= 6 && n <= 8) System.out.println("Summer");
        else if (n >= 9 && n <= 11) System.out.println("Fall");
        else if (n == 12 || n == 1 || n == 2) System.out.println("Winter");
        else System.out.println("-1");
    }
    public static int day (int m, int d, int y) {
        String month = m + "";
        if ("2".equals(month)) {
            if (leaf(y)) {
                if ((d >= 1 && d <= 29)) return m;
                else return -1;
            }
            else {
                if ((d >= 1 && d <= 28)) return m;
                else return -1;
            }
        }
        else if ("1 3 5 7 8 10 12".contains(month)) {
            if ((d >= 1 && d <= 31)) return m;
            else return -1;
        }
        else if ("4 6 9 11".contains(month)) {
            if ((d >= 1 && d <= 30)) return m;
            else return -1;
        }
        else return -1;
    }
    public static boolean leaf (int y) {
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) return true;
                else return false;
            }
            else return true;
        }
        else return false;
    }
}