import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        // Please write your code here.
        System.out.println(leap_year(y));
    }
    public static boolean leap_year(int y) {
        if (y % 4 != 0) return false;
        if (y % 100 == 0 && y % 400 != 0) return false;
        return true;
    }
}