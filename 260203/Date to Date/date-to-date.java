import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        int[] month = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day = 0;
        if (m1 == m2) day = d2 - d1 + 1;
        else if (m2 == m1 + 1) day = month[m1] - d1 + d2 + 1;
        else if (m2 > m1 + 1) {
            day += month[m1] - d1;
            for (int i = m1 + 1; i < m2; i++) {
                day += month[i];
            }
            day += d2 + 1;
        }
        System.out.println(day);
    }
}