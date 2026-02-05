import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int size = (n >= m) ? n : m;
        size *= 1000;
        int[][] chk = new int[2][size];

        int val1 = 0, val2 = 0, t1 = 0, t2 = 0;
        for (int i = 0; i < n; i++) {
            String direction = sc.next();
            int time = sc.nextInt();

            for (int j = 0; j < time; j++) {
                if (direction.equals("R")) {
                    val1++;
                }
                else {
                    val1--;
                }
                t1++;
                chk[0][t1] = val1;
            } 
        }

        for (int i = 0; i < m; i++) {
            String direction = sc.next();
            int time = sc.nextInt();

            for (int j = 0; j < time; j++) {
                if (direction.equals("R")) {
                    val2++;
                }
                else {
                    val2--;
                }
                t2++;
                chk[1][t2] = val2;
            } 
        }

        for (int i = t1 + 1; i < size; i++) {
            chk[0][i] = chk[0][i - 1];
        }
        for (int i = t2 + 1; i < size; i++) {
            chk[1][i] = chk[1][i - 1];
        }

        int res = -1;
        for (int i = 1; i < size; i++) {
            // System.out.println(chk[0][i] + " " + chk[1][i]);
            if (chk[0][i] == chk[1][i]) {
                res = i;
                break;
            }
        }
        System.out.print(res);
    }
}