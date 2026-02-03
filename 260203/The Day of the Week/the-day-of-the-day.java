import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        // Please write your code here.
        int[] month = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < m1; i++) {
            total1 += month[i];
        }
        total1 += d1;

        for (int i = 1; i < m2; i++) {
            total2 += month[i];
        }
        total2 += d2;

        int dif = total2 - total1 - Arrays.asList(day).indexOf(A);
        if (!(A.equals("Mon")) && dif / 7 == 0) System.out.println(0);
        else System.out.println(dif / 7 + 1);
    }
}