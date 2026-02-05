import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int res = -1;
        int[] person = new int[n + 1];
        int[] penalizedPerson = new int[m];
        for (int i = 0; i < m; i++) {
            penalizedPerson[i] = sc.nextInt();
            person[penalizedPerson[i]]++;
            if (person[penalizedPerson[i]] == k) {
                res = penalizedPerson[i];
                break;
            }
        }
        System.out.print(res);
    }
}