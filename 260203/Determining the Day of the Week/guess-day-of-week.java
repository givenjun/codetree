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
        String[] day = new String[]{"Tue", "Wed", "Thu", "Fri", "Sat", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i <= m1; i++) {
            if (i == m1) total1 += d1;
            else total1 += month[i]; 
        }

        for (int i = 1; i <= m2; i++) {
            if (i == m2) total2 += d2;
            else total2 += month[i]; 
        }

        int dif = (total2 - total1) % 7;
        System.out.println(day[6 + dif]);
    }
}